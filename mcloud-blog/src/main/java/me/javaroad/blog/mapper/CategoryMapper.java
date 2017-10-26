package me.javaroad.blog.mapper;

import me.javaroad.blog.dto.request.CategoryRequest;
import me.javaroad.blog.dto.response.CategoryResponse;
import me.javaroad.blog.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author heyx
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category mapRequestToEntity(CategoryRequest categoryRequest);

    CategoryResponse mapEntityToResponse(Category category);
}