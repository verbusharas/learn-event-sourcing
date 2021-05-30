package lt.verbus.user.query.api.repositories;

import lt.verbus.user.core.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
