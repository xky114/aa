package com.huarui.springcloud_2_zhongxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud2ZhongxinApplication {
    //注册中心
    public static void main(String[] args) {
        SpringApplication.run(Springcloud2ZhongxinApplication.class, args);
    }

}
