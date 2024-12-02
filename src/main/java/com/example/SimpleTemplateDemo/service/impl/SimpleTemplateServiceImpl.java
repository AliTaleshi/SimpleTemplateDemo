package com.example.SimpleTemplateDemo.service.impl;

import com.example.SimpleTemplateDemo.dto.SimpleTemplateDto;
import com.example.SimpleTemplateDemo.dto.SimpleTemplateLoadDto;
import com.example.SimpleTemplateDemo.mapper.SimpleTemplateMapper;
import com.example.SimpleTemplateDemo.model.SimpleTemplateEntity;
import com.example.SimpleTemplateDemo.repository.SimpleTemplateRepository;
import com.example.SimpleTemplateDemo.service.SimpleTemplateService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class SimpleTemplateServiceImpl implements SimpleTemplateService {

    private final SimpleTemplateRepository simpleTemplateRepository;
    private final SimpleTemplateMapper simpleTemplateMapper;

    @Override
    public Page<SimpleTemplateDto> findAllByFilter(SimpleTemplateLoadDto simpleTemplateLoadDto) {
        log.info("####inside findAllByFilter method####");

        String userName = "username1";

        int pageNumber = simpleTemplateLoadDto.getPageNumber() == null ? 0 : simpleTemplateLoadDto.getPageNumber();
        int pageSize = simpleTemplateLoadDto.getPageSize() == null ? 10 : simpleTemplateLoadDto.getPageSize();

        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, "insertTime");
        String title = simpleTemplateLoadDto.getTitle();

        Page<SimpleTemplateEntity> simpleTemplateEntityPage = simpleTemplateRepository.findAllByFilter(title, userName, pageable);

        List<SimpleTemplateEntity> content = simpleTemplateEntityPage.getContent();

        for (SimpleTemplateEntity entity : content) {
            log.info("Entity ID: {}, Title: {}, Inserted Time: {}, Context: {}",
                    entity.getId(),
                    entity.getTitle(),
                    entity.getInsertTime(),
                    entity.getContext());

        }

        List<SimpleTemplateDto> simpleTemplateDtoList = simpleTemplateMapper.entityListToDtoList(simpleTemplateEntityPage.getContent());
        log.info("after mapping entity to dto list");

        return new PageImpl<>(simpleTemplateDtoList, pageable, simpleTemplateEntityPage.getTotalElements());
    }
}
