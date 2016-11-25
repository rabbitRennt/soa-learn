	package com.jumore.b2b.activity.admin.base;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @ClassName: BaseController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2015年6月11日 上午10:12:25
 */
public class BaseController
{
    protected Logger logger = LogManager.getLogger(getClass().getName());

   
    @Resource
    protected HttpServletRequest request;

   
    protected static final String USER_SESSION_KEY="user_session_key";

    protected String getRemoteIP()
    {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
        {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
        {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
        {
            ip = request.getRemoteAddr();
        }
        if (ip != null && ip.length() > 0)
        {
            String[] ipArray = ip.split(",");
            if (ipArray != null && ipArray.length > 1)
            {
                return ipArray[0];
            }
            return ip;
        }

        return "未知IP";
    }
}