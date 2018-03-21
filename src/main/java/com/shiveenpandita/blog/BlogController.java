package com.shiveenpandita.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/api/blog")
public class BlogController {
    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    private BlogRepository blogRepository;

    @Autowired
    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @PostMapping("/saveBlog")
    public @ResponseBody
    Blog saveBlog(@RequestBody Blog blog) {
        Blog blogToSave = new Blog();
        blogToSave.setTitle(blog.getTitle());
        blogToSave.setBody(blog.getBody());
        logger.info("About to save the received blog {}", blog);
        Blog blogSaved = blogRepository.save(blogToSave);
        logger.info("Saved the blog entry {}", blogSaved);
        return blogSaved;
    }

    @GetMapping("/getAllBlogs")
    public @ResponseBody
    List<Blog> getAllBlogs() {
        logger.info("Returning all blogs");
        return blogRepository.findAll();
    }

    @GetMapping("/getBlogByTitle")
    public @ResponseBody
    List<Blog> getByTitle(@RequestParam String title) {
        logger.info("Getting all blogs with title {}", title);
        return blogRepository.findByTitle(title);
    }
}
