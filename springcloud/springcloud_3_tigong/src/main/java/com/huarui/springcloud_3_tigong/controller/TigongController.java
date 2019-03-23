package com.huarui.springcloud_3_tigong.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author :许孔妤
 * @ Date :Created in 16:47 2019/3/21
 * @ Description:提供控制层
 */
@RestController
public class TigongController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String ee(){
        return "出错了";
    }
    @RequestMapping("/test")
    public String mess(String name){
        return "提供者："+name;
    }
}
