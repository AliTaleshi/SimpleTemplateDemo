package com.example.SimpleTemplateDemo.controller;

import com.example.SimpleTemplateDemo.dto.SimpleTemplateLoadDto;
import com.example.SimpleTemplateDemo.service.SimpleTemplateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SimpleTemplateController {

    private final SimpleTemplateService simpleTemplateService;

    @GetMapping(value = "/find")
    public HttpStatus getSimpleTemplateList() {
        SimpleTemplateLoadDto simpleTemplateLoadDto = new SimpleTemplateLoadDto();
        simpleTemplateLoadDto.setTitle("title1");
        simpleTemplateLoadDto.setPageSize(5);
        simpleTemplateLoadDto.setPageNumber(1);
        simpleTemplateService.findAllByFilter(simpleTemplateLoadDto);
        return HttpStatus.ACCEPTED;
    }
}
