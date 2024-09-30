package com.backend.backend.service.impl;

import com.backend.backend.dto.BlogDto;
import com.backend.backend.entity.Blog;
import com.backend.backend.exception.ResourceNotFound;
import com.backend.backend.mapper.BlogMapper;
import com.backend.backend.repository.BlogRepository;
import com.backend.backend.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;
    @Override
    public BlogDto createBlog(BlogDto blogDto) {

        Blog blog = BlogMapper.mapToBlog(blogDto);
        Blog savedBlog = blogRepository.save(blog);
        return BlogMapper.mapToBlogDto(savedBlog);
    }

    @Override
    public BlogDto getBlogById(Long id) {
        Blog blog = blogRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFound("Blog not found with given id: " + id));
        return BlogMapper.mapToBlogDto(blog);
    }

}
