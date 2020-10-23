package com.chen.hi.interceptor;

import com.google.gson.Gson;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class FeignTrackInterceptor implements RequestInterceptor {
    private static final String HEAD_ID = "head_id";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.info("request:{}", new Gson().toJson(request.getHeader(HEAD_ID)));
        log.info("feign:{}", new Gson().toJson(requestTemplate.header(HEAD_ID)));
        String headId = request.getHeader(HEAD_ID);
        if(headId==null){
            headId = (String)request.getAttribute(HEAD_ID);
        }
        requestTemplate.header(HEAD_ID, headId);
    }
}
