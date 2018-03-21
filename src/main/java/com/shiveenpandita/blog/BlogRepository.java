package com.shiveenpandita.blog;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BlogRepository extends MongoRepository<Blog, String> {

    public List<Blog> findByTitle(String title);

    public List<Blog> findAll();

}
