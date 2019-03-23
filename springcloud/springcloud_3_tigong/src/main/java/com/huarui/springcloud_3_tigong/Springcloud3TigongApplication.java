package com.huarui.springcloud_3_tigong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloud3TigongApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud3TigongApplication.class, args);
    }

}
