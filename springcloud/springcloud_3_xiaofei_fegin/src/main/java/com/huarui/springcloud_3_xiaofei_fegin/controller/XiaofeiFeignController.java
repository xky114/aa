package com.huarui.springcloud_3_xiaofei_fegin.controller;

import com.huarui.springcloud_3_xiaofei_fegin.service.XiaoFeiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author :许孔妤
 * @ Date :Created in 16:51 2019/3/21
 * @ Description:消费者控制层
 */
@RestController
public class XiaofeiFeignController {
    @Autowired
    private XiaoFeiFeign xiaoFeiFeign;

    @RequestMapping("/test")
    public String mess(String name){
       return  xiaoFeiFeign.mess(name);
    }

}
