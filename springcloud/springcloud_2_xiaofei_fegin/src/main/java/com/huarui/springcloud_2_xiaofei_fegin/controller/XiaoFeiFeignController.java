package com.huarui.springcloud_2_xiaofei_fegin.controller;

import com.huarui.springcloud_2_xiaofei_fegin.service.XiaoFeiFegin;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:51 2019/3/20
 * @ Description:http客户端控制层
 */
@RestController
public class XiaoFeiFeignController {
    @Autowired
    private XiaoFeiFegin xiaoFeiFegin;

    @RequestMapping("/test")
    public String mess(String name){
        return xiaoFeiFegin.mess(name);
    }
}
