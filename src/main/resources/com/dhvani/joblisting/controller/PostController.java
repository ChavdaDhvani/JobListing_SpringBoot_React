package com.dhvani.joblisting.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhvani.joblisting.model.Post;
import com.dhvani.joblisting.repository.PostRepository;
import com.dhvani.joblisting.repository.SearchRepo;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController 
{
	@Autowired
	PostRepository repo;
	
	@Autowired
	SearchRepo search;
	
	@Hidden
	@RequestMapping("/")
	public void redirect(HttpServletResponse res) throws IOException
	{
		res.sendRedirect("/swagger-ui.html");
	}
	
	
	@GetMapping("/posts")
	public List<Post> getAllPost()
	{
		return repo.findAll();
	}
	
	@GetMapping("/posts/{text}")
	public List<Post> search(@PathVariable String text)
	{
		return search.findByText(text);
	}
	
	
	@PostMapping("/post")
	public void addPost(@RequestBody Post post)
	{
		repo.save(post);
		
	}
	
	

}
