package rest.api.post.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rest.api.post.demo.models.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer> {

}
