package com.pamstruct.demo;

import com.pamstruct.demo.dto.BmwE60DTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BmwE60Mapper {

    @Mapping(target = "bmwE60DTO.factory", source = "factory")
    void map(@MappingTarget BmwE60DTO bmwE60DTO, Factory factory);

}