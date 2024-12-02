package com.example.SimpleTemplateDemo.mapper;

import com.example.SimpleTemplateDemo.dto.SimpleTemplateDto;
import com.example.SimpleTemplateDemo.model.SimpleTemplateEntity;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface SimpleTemplateMapper {

    SimpleTemplateDto entityToDto(SimpleTemplateEntity entity);

    SimpleTemplateEntity dtoToEntity(SimpleTemplateDto dto);

    List<SimpleTemplateDto> entityListToDtoList(List<SimpleTemplateEntity> entityList);

    List<SimpleTemplateEntity> dtoListToEntityList(List<SimpleTemplateDto> dtoList);

}
