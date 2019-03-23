package com.huarui.springcloud_3_tigong_zuul;

import com.huarui.springcloud_3_tigong_zuul.error.ZidingyiError;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Springcloud3TigongZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud3TigongZuulApplication.class, args);
    }

    @Bean
    public ZidingyiError ee(){
        return new ZidingyiError();
    }
}
