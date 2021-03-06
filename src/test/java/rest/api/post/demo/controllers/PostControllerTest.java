package rest.api.post.demo.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import rest.api.post.demo.models.Post;
import rest.api.post.demo.services.PostService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class PostControllerTest {

    @Mock
    private PostService mockPostService;

    private PostController postControllerUnderTest;

    @BeforeEach
    void setUp() {
        initMocks(this);
        postControllerUnderTest = new PostController(mockPostService);
    }

    @Test
    void testGetAllPosts() {

        final List<Post> expectedResult = Arrays.asList();
        when(mockPostService.getAll()).thenReturn(Arrays.asList());


        final List<Post> result = postControllerUnderTest.getAllPosts();


        assertEquals(expectedResult, result);
    }

    @Test
    void testAddPost() {

        final Post p = new Post("id", "value", null, null,null,null);
        final Post expectedResult = new Post("id", "value", null, null,null,null);
        when(mockPostService.create(any(Post.class))).thenReturn(new Post("id", "value", null, null,null,null));


        final Post result = postControllerUnderTest.addPost(p);


        assertEquals(expectedResult, result);
    }

    @Test
    void testGetPost() {
        // Setup
        final String id = "id";
        final Optional<Post> expectedResult = Optional.empty();
        when(mockPostService.getById("id")).thenReturn(Optional.empty());

        // Run the test
        final Optional<Post> result = postControllerUnderTest.getPost(id);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    void testUpdatePost() {

        final String id = "id";
        final String title = "title";
        final String value = "value";
        final Post expectedResult = new Post("id", "value", null, null,null,null);
        when(mockPostService.update("title", "body")).thenReturn(new Post("id", "value", null,null, null,null));

        final Post result = postControllerUnderTest.updatePost(id, title, value);


        assertEquals(expectedResult, result);
    }

    @Test
    void testDeletePost() {

        final String id = "id";
        final String expectedResult = "result";


        final String result = postControllerUnderTest.deletePost(id);

        assertEquals(expectedResult, result);
        verify(mockPostService).deleteById("id");
    }

    @Test
    void testGetPostByFewLetters() {

        final String title = "title";
        final List<Post> expectedResult = Arrays.asList();
        when(mockPostService.getAll()).thenReturn(Arrays.asList());


        final List<Post> result = postControllerUnderTest.getPostByFewLetters(title);


        assertEquals(expectedResult, result);
    }
}
