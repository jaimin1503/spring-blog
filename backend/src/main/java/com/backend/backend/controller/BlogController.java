package com.backend.backend.controller;

import com.backend.backend.dto.BlogDto;
import com.backend.backend.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/blog")
public class BlogController {
    private BlogService blogService;

    //REST Apis

    @PostMapping("/create")
    public ResponseEntity<BlogDto> createBlog(@RequestBody BlogDto blogDto){
        BlogDto createdBlog = blogService.createBlog(blogDto);
        return new  ResponseEntity<>(createdBlog, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogDto> getBlogById(@PathVariable("id") Long id){
        BlogDto blogDto = blogService.getBlogById(id);
        return new ResponseEntity<>(blogDto, HttpStatus.OK);
    }

}
