package com.huarui.springcloud_3_xiaofei_fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Springcloud3XiaofeiFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud3XiaofeiFeginApplication.class, args);
    }

}
