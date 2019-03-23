package com.huarui.springcloud_1_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Springcloud1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1ServiceApplication.class, args);
    }
    //负载均衡
    //并且向程序的ioc控制反转注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restTemplate开启负载均衡的功能。
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
