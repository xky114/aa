package com.huarui.springcloud_3_zhongxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud3ZhongxinApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud3ZhongxinApplication.class, args);
    }

}
