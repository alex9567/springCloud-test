package com.chen.openFeign.service;


import com.chen.openFeign.common.ResultTest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hi")
@FeignClient(name = "SERVICE-HI")
public interface ChenTestService2 {
    @RequestMapping("/test1")
    public ResultTest<String> test1();
    @RequestMapping("/test2")
    public ResultTest<String> test2();
    @RequestMapping("/test3")
    public ResultTest<String> test3();
}