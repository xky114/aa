package com.huarui.springcloud_2_xiaofei.controller;

import com.huarui.springcloud_2_xiaofei.service.XiaoFeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author :许孔妤
 * @ Date :Created in 16:54 2019/3/20
 * @ Description:消费者控制层
 */
@RestController
public class XiaoFeiController {
    @Autowired
    private XiaoFeiService xiaoFeiService;

    @RequestMapping("/test")
    public String mess(String name){
       return  xiaoFeiService.mess(name);
    }
}
