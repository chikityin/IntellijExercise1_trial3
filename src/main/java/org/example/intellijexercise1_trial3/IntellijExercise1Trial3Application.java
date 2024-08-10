package org.example.intellijexercise1_trial3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class IntellijExercise1Trial3Application {

    public static void main(String[] args) {

        SpringApplication.run(IntellijExercise1Trial3Application.class, args);
    }

}
