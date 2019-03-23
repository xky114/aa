package com.huarui.springcloud_2_xiaofei.service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author :许孔妤
 * @ Date :Created in 16:51 2019/3/20
 * @ Description:消费者
 */
@Service
public class XiaoFeiService {

    @Autowired
    private RestTemplate restTemplate;

    //断路器跳方法，也就是只要报错就跳指定方法
    @HystrixCommand(fallbackMethod = "ErrorHystrix")
    public String mess(String name){
       return  restTemplate.getForObject("http://springcloud-tigong/test?name="+name,String.class);
    }
    public String ErrorHystrix(String name){
        return "你好，"+name+",服务器故障";
    }
}
