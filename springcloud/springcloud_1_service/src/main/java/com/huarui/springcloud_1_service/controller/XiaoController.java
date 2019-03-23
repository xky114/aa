package com.huarui.springcloud_1_service.controller;

import com.huarui.springcloud_1_service.service.XiaoService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:33 2019/3/19
 * @ Description:服务消费者控制层
 */
@RestController

public class XiaoController{
    @Autowired
    private XiaoService xiaoService;
    //测试调用别的项目的方法 通过服务中心
    @RequestMapping("/testTigong")

    public String testTigong(String name){
       return  xiaoService.TestTiGong(name);
    }
}
