package com.nickjames.boot_one.student;

import static java.time.Month.JANUARY;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 12));

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 12));

            repository.saveAll(List.of(mariam, alex));
        };

    }

}
