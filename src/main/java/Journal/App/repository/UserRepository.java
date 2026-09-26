package Journal.App.repository;

import Journal.App.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {//given <string >as the id datatype is string
    User findByUserName(String userName);

    void deleteByUserName(String userName);
}
