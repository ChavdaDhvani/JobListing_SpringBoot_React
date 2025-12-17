package com.dhvani.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dhvani.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {

	

}
