package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller", "service", "repository"})
public class TourisGuideApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TourisGuideApiApplication.class, args);
    }

    // Tilføj yderligere konfiguration eller initialisering her
}


