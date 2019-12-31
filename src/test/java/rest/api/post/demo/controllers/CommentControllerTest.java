package rest.api.post.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import rest.api.post.demo.models.Comment;
import rest.api.post.demo.services.CommentService;

public class CommentControllerTest {

	 @Mock
	    private CommentService mockCommentService;

	    private CommentController commentControllerUnderTest;

	    @BeforeEach
	    void setUp() {
	        initMocks(this);
	        commentControllerUnderTest = new CommentController(mockCommentService);
	    }

	    @Test
	    void testGetAllComments() {

	    	final String id = "id";
	        final String postId = "postId";
	        final List<Comment> expectedResult = Arrays.asList();
	        when(mockCommentService.getAll(id,postId)).thenReturn((rest.api.post.demo.models.Comment) Arrays.asList());


	        final List<rest.api.post.demo.models.Comment> result = commentControllerUnderTest.getAllPosts(id, postId);


	        assertEquals(expectedResult, result);
	    }

	    @Test
	    void testAddComment() {
	    	
	        final Comment p = new Comment(2, null, null , null  , null);
	        final Comment expectedResult = new Comment(2, null, null , null  , null);
	        when(mockCommentService.create((rest.api.post.demo.models.Comment) any(Comment.class))).thenReturn(new Comment(2, null, null , null  , null));


	        final Comment result = commentControllerUnderTest.addPost(p);


	        assertEquals(expectedResult, result);
	    }

	    @Test
	    void testGetComment() {
	        // Setup
	        final String id = "gg";
	        final Optional<Object> expectedResult = Optional.empty();
	        when(mockCommentService.getComment(id));

	        // Run the test
	        final Comment result = commentControllerUnderTest.getPost(id);

	        // Verify the results
	        assertEquals(expectedResult, result);
	    }

	    @Test
	    void testUpdatePost() {

	        final String id = "id";
	        final String body = "value";
	        final String title = "";
	        final Comment expectedResult = new Comment(2, null, null , null  , null);
	        when(mockCommentService.update("id", "body")).thenReturn(new Comment(2, null, null , null  , null));

	        final Comment result = commentControllerUnderTest.updatePost(id, title, body);


	        assertEquals(expectedResult, result);
	    }

	    @Test
	    void testDeleteComment() {

	        final String id = "id";
	        final String expectedResult = "result";


	        final String result = commentControllerUnderTest.deletePost(id);

	        assertEquals(expectedResult, result);
	        verify(mockCommentService).delete(id);
	    }

	  
	}
