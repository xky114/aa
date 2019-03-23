package com.huarui.springboot_1_tigong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springboot1TigongApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1TigongApplication.class, args);
    }

}
