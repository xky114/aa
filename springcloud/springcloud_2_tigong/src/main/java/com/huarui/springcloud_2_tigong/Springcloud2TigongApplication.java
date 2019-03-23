package com.huarui.springcloud_2_tigong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springcloud2TigongApplication {
//服务提供者
    public static void main(String[] args) {
        SpringApplication.run(Springcloud2TigongApplication.class, args);
    }

}
