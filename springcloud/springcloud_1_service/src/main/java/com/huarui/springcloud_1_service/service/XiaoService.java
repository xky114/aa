package com.huarui.springcloud_1_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:30 2019/3/19
 * @ Description:
 */
@Service
public class XiaoService {

    @Autowired
    private RestTemplate restTemplate;

    public String TestTiGong(String name){
       return  restTemplate.getForObject("http://springcloud1-tigong/tigong?name="+name,String.class);
    }
}
