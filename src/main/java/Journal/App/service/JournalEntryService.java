package Journal.App.service;

import Journal.App.entity.JournalEntry;
import Journal.App.entity.User;
import Journal.App.repository.JournalEntryRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Component
@Slf4j
public class JournalEntryService {
        @Autowired
        private JournalEntryRepository journalEntryRepository;

        @Autowired
        private UserService userService;


        @Transactional
        public void saveEntry(JournalEntry journalEntry, String userName){
            try{
                User user =userService.findByUsername(userName);
                journalEntry.setDate(LocalDateTime.now());
                JournalEntry saved=journalEntryRepository.save(journalEntry);
                user.getJournalEntries().add(saved);
                userService.saveUser(user);
            }catch(Exception e){
                System.out.println(e);
                throw new RuntimeException("An error has occur");
            }

        }

        public void saveEntry(JournalEntry journalEntry){
            journalEntryRepository.save(journalEntry);
        }

        public List<JournalEntry> getAll(){
            return journalEntryRepository.findAll();
        }

        public Optional<JournalEntry> findById(ObjectId id){
            return journalEntryRepository.findById(id);
        }

        @Transactional
        public boolean  deleteById(ObjectId id, String userName){
            boolean removed=false;
            try{
                User user =userService.findByUsername(userName);
                removed=user.getJournalEntries().removeIf(x -> x.getId().equals(id));
                if(removed){
                    userService.saveUser(user);
                    journalEntryRepository.deleteById(id);
                }
            }catch(Exception e){
                log.error(e.getMessage());
                throw new RuntimeException("An error has occur while deleting the journal entry");
            }
            return removed;
        }

//        public List<JournalEntry> findByUserName(String userName){}
}
