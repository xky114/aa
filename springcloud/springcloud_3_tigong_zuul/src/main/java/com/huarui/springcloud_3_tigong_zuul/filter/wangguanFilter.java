package com.huarui.springcloud_3_tigong_zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ Author :许孔妤
 * @ Date :Created in 17:17 2019/3/21
 * @ Description:网关过滤
 */
@Component
public class wangguanFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
        //pre 代表进入路由之前
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
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        Object zuulName = request.getParameter("zuulName");//假装测试 如果获取的数据为空则无法进入路由
        if(zuulName==null){
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(666);
            try {
                currentContext.getResponse().getWriter().write("shabi!!error");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
