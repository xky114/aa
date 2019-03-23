package com.huarui.springcloud_2_tigong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.GongService;

/**
 * @ Author :许孔妤
 * @ Date :Created in 16:43 2019/3/20
 * @ Description:提供者控制层
 */
@RestController
public class TiGongController implements GongService {
    @Override
    public String mess(String name) {
        return "根据实现公共接口的提供者："+name;
    }
}
