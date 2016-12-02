package com.jumore.b2b.activity.admin.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Controller  
@RequestMapping("/controllerReflect")  
public class ControllerReflect {  
	
	
	@Autowired
    RequestMappingHandlerConfig requestMappingHandlerConfig;

    //Spring MVC 提取注解中URL映射
    public void detectHandlerMethods(){
        final RequestMappingHandlerMapping requestMappingHandlerMapping = requestMappingHandlerConfig.requestMappingHandlerMapping ();
        Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping.getHandlerMethods();

        Set<RequestMappingInfo> mappings = map.keySet();
        Map<String, String> reversedMap = new HashMap<String, String>();
        for(RequestMappingInfo info : mappings) {
            HandlerMethod method = map.get(info);
            System.out.println (method.toString()+"===>"+info.getPatternsCondition().toString());
        }
    }
    
    
    @ResponseBody  
    @RequestMapping("getUrlMapping")  
    public Object getUrlMapping(HttpServletRequest request) {  
        WebApplicationContext wc = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession().getServletContext());  
     
        final RequestMappingHandlerMapping requestMappingHandlerMapping = requestMappingHandlerConfig.requestMappingHandlerMapping ();
        Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping.getHandlerMethods();

        
        
        for(RequestMappingInfo info : map.keySet()){  
            System.out.println(info.getPatternsCondition().toString()  
                    + ","  
                    +map.get(info).getBean().toString());  
        }  
        return null;  
    }  
}  