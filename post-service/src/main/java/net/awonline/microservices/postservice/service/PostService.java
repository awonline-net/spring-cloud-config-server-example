package net.awonline.microservices.postservice.service;

import org.springframework.stereotype.Service;

import net.awonline.microservices.postservice.model.Post;

@Service
public class PostService {

	public Post getPost(String postId) {
		Post post = new Post();
		post.setId("" + postId);
		post.setDescription("Post[" + postId + "] description");
		return post;
	}
}
