package com.example.SimpleTemplateDemo.repository;

import com.example.SimpleTemplateDemo.model.SimpleTemplateEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SimpleTemplateRepository extends JpaRepository<SimpleTemplateEntity, Long> {

    @Query(value = "SELECT s FROM SimpleTemplateEntity s " +
            "WHERE (:title is null OR s.title LIKE %:title%) " +
            "AND s.username = :userName ")
    Page<SimpleTemplateEntity> findAllByFilter(@Param("title") String title,
                                               @Param("userName") String userName,
                                               Pageable pageable);
}
