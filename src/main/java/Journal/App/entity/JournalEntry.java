package Journal.App.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document  (collection="journal_entries") //tells that this class is mapped with mongoDb collection (so it is equal to a row  )
@Data
@NoArgsConstructor
public class JournalEntry {
    @Id //unique for all entity
    private ObjectId id;
    
    private String title;
    private String content;
    private LocalDateTime date;




}