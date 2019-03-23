package com.huarui.springboot_1_tigong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:26 2019/3/19
 * @ Description:测试服务提供者的方法
 */
@RestController
public class TiGongController {

    @RequestMapping("/tigong")
    public String tiGong(String name){
        return "服务提供者的方法：参数是"+name;
    }
}
