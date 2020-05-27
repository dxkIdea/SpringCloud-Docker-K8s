package com.dxk.springcloud.netflix.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.http.HttpStatus;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/27
 * Time: 21:43
 * Description: 权限过滤器
 */
public class AccessFilter extends ZuulFilter {
    /**
     * pre：可以在请求被路由之前调用
     * routing： 路由请求时被调用
     * post：在routing和error过滤器之后被调用
     * error: 处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder：通过返回的int值来定义过滤器的执行顺序，数字越小优先级越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter：返回一个Boolean值，判断该过滤器是否需要执行。返回true执行，返回false不执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体业务逻辑
     * @return
     */
    @Override
    public Object run()  {
        //获取zuul提供的上下文对象
        RequestContext context = RequestContext.getCurrentContext();
        //获取request对象
        HttpServletRequest request = context.getRequest();
        //获取请求参数
        String accessToken = request.getHeader("accessToken");
        //判断
        if (StringUtils.isEmpty(accessToken)){
            //过滤该请求，不对其进行路由
            context.setSendZuulResponse(false);
            //设置响应码401
            context.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            //设置响应体
            context.setResponseBody("request error....");
        }
        return null;
    }
}
