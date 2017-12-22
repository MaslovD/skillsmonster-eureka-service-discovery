package io.dmitr.skillsmonster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurekaRegistartionCoreApplication {



    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistartionCoreApplication.class, args);
    }
}
