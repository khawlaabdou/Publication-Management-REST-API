package rest.api.post.demo.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Posts")
public class Post {

    @Id
    private String id;
    private String value;
    private User user;
    private String datepub;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getDatepub() {
        return datepub;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Post(String id, String value,String  datepub, User user) {
        this.id = id;
        this.value = value;
        this.datepub = datepub;
        this.user = user;
    }





}
