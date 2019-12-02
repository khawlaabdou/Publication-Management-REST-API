package rest.api.post.demo.reposetories;
import java.util.Optional;

import rest.api.post.demo.models.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {

    Optional <User> findByUsername(String username);

}
