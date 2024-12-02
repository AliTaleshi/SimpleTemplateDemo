package com.example.SimpleTemplateDemo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SimpleTemplateLoadDto {

    private String title;

    private Integer pageNumber;
    private Integer pageSize;

}
