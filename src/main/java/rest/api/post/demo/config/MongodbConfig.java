package rest.api.post.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rest.api.post.demo.repositories.PostRepository;


//@EnableMongodbrepositories(basePackageClasses = PostRepository.class)
@Component
public class MongodbConfig implements CommandLineRunner{

    public MongodbConfig(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    private PostRepository postRepository;



    @Override
    public void run(String... args) throws Exception {


    }


}
