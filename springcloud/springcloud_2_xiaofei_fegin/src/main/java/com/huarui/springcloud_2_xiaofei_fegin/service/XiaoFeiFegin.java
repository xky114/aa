package com.huarui.springcloud_2_xiaofei_fegin.service;

import com.huarui.springcloud_2_xiaofei_fegin.hystrix.Hihystrix;
import org.springframework.cloud.openfeign.FeignClient;
import service.GongService;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:39 2019/3/20
 * @ Description:消费fegin接口 不需要实现类 fegin代理实现
 */
@FeignClient(value = "springcloud-tigong",fallback = Hihystrix.class)
public interface XiaoFeiFegin extends GongService {

}
