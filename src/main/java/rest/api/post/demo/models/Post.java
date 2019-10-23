package rest.api.post.demo.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Posts")
public class Post {

    @Id
    private String id;
    private String value;
    private User user;
    private int datepub;



    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public int getDatepub() {
        return datepub;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Post(String id, String value, int datepub, User user) {
        this.id = id;
        this.value = value;
        this.datepub = datepub;
        this.user = user;
    }







}