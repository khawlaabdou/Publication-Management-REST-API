package rest.api.post.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rest.api.post.demo.reposetories.PostRepositpory;


//@EnableMongodbrepositories(basePackageClasses = PostRepository.class)
@Component
public class MongodbConfig implements CommandLineRunner{

    public MongodbConfig(PostRepositpory postRepository) {
        this.postRepository = postRepository;
    }

    private PostRepositpory postRepository;



    @Override
    public void run(String... args) throws Exception {


    }


}
