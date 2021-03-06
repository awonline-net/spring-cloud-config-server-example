package net.awonline.microservices.postservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.awonline.microservices.postservice.model.Post;
import net.awonline.microservices.postservice.service.PostService;

@RestController
@RequestMapping(value = "v1/posts/{postId}")
public class CommentServiceController {

	@Autowired
	PostService postService;

	@RequestMapping(method = RequestMethod.GET)
	public Post getComments(@PathVariable("postId") String postId) {
		return postService.getPost(postId);
	}
}
