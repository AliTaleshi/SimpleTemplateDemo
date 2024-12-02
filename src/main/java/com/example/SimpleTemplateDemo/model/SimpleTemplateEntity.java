package com.example.SimpleTemplateDemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "simple_template")
public class SimpleTemplateEntity {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 4000)
    private String context;

    private LocalDateTime insertTime = LocalDateTime.now();
    private LocalDateTime lastUpdate;
    private String username;

    private String externalId = UUID.randomUUID().toString().replace("-", "");

}
