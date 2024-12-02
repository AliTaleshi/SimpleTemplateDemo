package com.example.SimpleTemplateDemo.service;

import com.example.SimpleTemplateDemo.dto.SimpleTemplateDto;
import com.example.SimpleTemplateDemo.dto.SimpleTemplateLoadDto;
import org.springframework.data.domain.Page;

public interface SimpleTemplateService {

    Page<SimpleTemplateDto> findAllByFilter(SimpleTemplateLoadDto simpleTemplateLoadDto);
}
