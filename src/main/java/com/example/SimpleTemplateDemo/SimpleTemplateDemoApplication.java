package com.example.SimpleTemplateDemo;

import com.example.SimpleTemplateDemo.model.SimpleTemplateEntity;
import com.example.SimpleTemplateDemo.repository.SimpleTemplateRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class SimpleTemplateDemoApplication {

	private final SimpleTemplateRepository simpleTemplateRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimpleTemplateDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			SimpleTemplateEntity simpleTemplateEntity1 = new SimpleTemplateEntity();
			simpleTemplateEntity1.setTitle("title1");
			simpleTemplateEntity1.setId(23l);
			simpleTemplateEntity1.setContext("context1");
			simpleTemplateEntity1.setUsername("username1");
			simpleTemplateRepository.save(simpleTemplateEntity1);
			System.out.println("SimpleTemplate created with id: " + simpleTemplateEntity1.getId());

			SimpleTemplateEntity simpleTemplateEntity6 = new SimpleTemplateEntity();
			simpleTemplateEntity6.setTitle("title1");
			simpleTemplateEntity6.setId(1l);
			simpleTemplateEntity6.setContext("context6");
			simpleTemplateEntity6.setUsername("username1");
			simpleTemplateRepository.save(simpleTemplateEntity6);
			System.out.println("SimpleTemplate created with id: " + simpleTemplateEntity6.getId());

			SimpleTemplateEntity simpleTemplateEntity2 = new SimpleTemplateEntity();
			simpleTemplateEntity2.setTitle("title1");
			simpleTemplateEntity2.setId(3l);
			simpleTemplateEntity2.setContext("context2");
			simpleTemplateEntity2.setUsername("username1");
			simpleTemplateRepository.save(simpleTemplateEntity2);
			System.out.println("SimpleTemplate created with id: " + simpleTemplateEntity2.getId());

			SimpleTemplateEntity simpleTemplateEntity5 = new SimpleTemplateEntity();
			simpleTemplateEntity5.setTitle("title1");
			simpleTemplateEntity5.setId(9l);
			simpleTemplateEntity5.setContext("context5");
			simpleTemplateEntity5.setUsername("username1");
			simpleTemplateRepository.save(simpleTemplateEntity5);
			System.out.println("SimpleTemplate created with id: " + simpleTemplateEntity5.getId());

			SimpleTemplateEntity simpleTemplateEntity3 = new SimpleTemplateEntity();
			simpleTemplateEntity3.setTitle("title1");
			simpleTemplateEntity3.setId(7l);
			simpleTemplateEntity3.setContext("context3");
			simpleTemplateEntity3.setUsername("username1");
			simpleTemplateRepository.save(simpleTemplateEntity3);
			System.out.println("SimpleTemplate created with id: " + simpleTemplateEntity3.getId());

			SimpleTemplateEntity simpleTemplateEntity4 = new SimpleTemplateEntity();
			simpleTemplateEntity4.setTitle("title1");
			simpleTemplateEntity4.setId(3l);
			simpleTemplateEntity4.setContext("context4");
			simpleTemplateEntity4.setUsername("username1");
			simpleTemplateRepository.save(simpleTemplateEntity4);
			System.out.println("SimpleTemplate created with id: " + simpleTemplateEntity4.getId());

		};
	}

}
