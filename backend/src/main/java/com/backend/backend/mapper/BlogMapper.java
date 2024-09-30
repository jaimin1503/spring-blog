package com.backend.backend.mapper;

import com.backend.backend.dto.BlogDto;
import com.backend.backend.entity.Blog;

public class BlogMapper {

    public static BlogDto mapToBlogDto(Blog blog){
     return new BlogDto(
             blog.getId(),
             blog.getTitle(),
             blog.getContent(),
             blog.getAuthor());
    }

    public static Blog mapToBlog(BlogDto blogDto){
        return new Blog(
                blogDto.getId(),
                blogDto.getTitle(),
                blogDto.getContent(),
                blogDto.getAuthor());
    }

}
