package com.dhvani.joblisting.repository;

import java.util.List;

import com.dhvani.joblisting.model.Post;

public interface SearchRepo 
{
	List<Post> findByText(String text);

}
