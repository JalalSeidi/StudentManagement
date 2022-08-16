package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student mariam = new Student("Mariam", "marima@gmail.com",
                    LocalDate.of(2000, APRIL,1));

            Student alex = new Student("Alex", "alex@gmail.com",
                    LocalDate.of(2004, APRIL,1));

            repository.saveAll(List.of(mariam, alex));

        };
    }
}
