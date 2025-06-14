package org.example.sof3041_sum25_sd20102;

import org.example.sof3041_sum25_sd20102.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sof3041Sum25Sd20102Application {

    public static void main(String[] args) {
        SpringApplication.run(Sof3041Sum25Sd20102Application.class, args);
        System.out.println("Oki");

        new Student(1, "Alice", 20, 11.0);

    }

}
