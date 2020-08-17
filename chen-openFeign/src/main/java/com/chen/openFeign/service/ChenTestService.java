package com.chen.openFeign.service;


import com.chen.openFeign.common.ResultTest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "SERVICE-HI")
public interface ChenTestService {
    @RequestMapping("/test1")
    public ResultTest<String> test1();
    @RequestMapping("/test2")
    public ResultTest<String> test2();
}