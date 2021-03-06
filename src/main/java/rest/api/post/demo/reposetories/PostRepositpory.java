package rest.api.post.demo.reposetories;

import org.springframework.data.mongodb.repository.MongoRepository;
import rest.api.post.demo.models.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepositpory extends MongoRepository<Post, String> {

     Post findByTitle(String title);
     List <Post> findByTitleRegex(String title);
     Optional<Post> findById(String id);


}
