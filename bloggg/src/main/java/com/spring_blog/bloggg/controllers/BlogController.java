package com.spring_blog.bloggg.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/blog/{id}")
    public String getBlogById(@PathVariable String id) {
        String s = "Hello World" + id;
        return s;
    }
}
