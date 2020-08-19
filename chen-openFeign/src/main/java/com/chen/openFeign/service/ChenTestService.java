package com.chen.openFeign.service;


import com.chen.openFeign.common.ResultTest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/hi")
@FeignClient(name = "SERVICE-HI")
public interface ChenTestService {
    @RequestMapping("/test1")
    public ResultTest<String> test1();
    //如果没有下载我的另一个项目，需要注释这个方法，因为没有其他微服务可以使用
    @RequestMapping("/test2")
    public ResultTest<String> test2();
    //如果没有下载我的另一个项目，需要注释这个方法，因为没有其他微服务可以使用
    @RequestMapping("/test3")
    public ResultTest<String> test3();
}