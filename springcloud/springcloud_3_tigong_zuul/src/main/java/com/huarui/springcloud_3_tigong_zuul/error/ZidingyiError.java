package com.huarui.springcloud_3_tigong_zuul.error;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ Author :许孔妤
 * @ Date :Created in 18:18 2019/3/21
 * @ Description:异常处理
 */
public class ZidingyiError extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(ZidingyiError.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info("cuowu");
        error();
        return null;
    }

    public void error(){
        new ExceptionInInitializerError();
    }
}
