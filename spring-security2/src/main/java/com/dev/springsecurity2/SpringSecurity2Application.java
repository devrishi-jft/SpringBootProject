package com.dev.springsecurity2;

import com.dev.springsecurity2.repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurity2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurity2Application.class, args);
    }

}
