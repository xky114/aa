package com.huarui.springcloud_3_xiaofei_fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author :许孔妤
 * @ Date :Created in 16:48 2019/3/21
 * @ Description:消费者http客户端调用提供者
 */
@FeignClient(value = "springcloud-tigong")
public interface XiaoFeiFeign {

    @RequestMapping("/test")
    public String mess(@RequestParam("name") String name);

}
