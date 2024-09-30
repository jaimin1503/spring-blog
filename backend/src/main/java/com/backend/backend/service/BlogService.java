package com.backend.backend.service;

import com.backend.backend.dto.BlogDto;

public interface BlogService {
    BlogDto createBlog(BlogDto blogDto);

    BlogDto getBlogById(Long id);
}
