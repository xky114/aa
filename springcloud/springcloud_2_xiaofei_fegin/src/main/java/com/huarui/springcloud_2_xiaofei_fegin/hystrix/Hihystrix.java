package com.huarui.springcloud_2_xiaofei_fegin.hystrix;

import com.huarui.springcloud_2_xiaofei_fegin.service.XiaoFeiFegin;
import org.springframework.stereotype.Component;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:44 2019/3/20
 * @ Description:断路器结合Feign
 */
//未知类注解
@Component
public class Hihystrix implements XiaoFeiFegin {
   public String mess(String name){
        return "服务器故障"+name;
    }
}
