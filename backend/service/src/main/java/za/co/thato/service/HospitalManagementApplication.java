package za.co.thato.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"za.co.thato"})
public class HospitalManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(HospitalManagementApplication.class, args);
    }
}
