package com.chen.openFeign.service;


import com.chen.openFeign.common.ResultTest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//如果没有下载我的另一个项目，需要删除整个类，因为没有其他微服务可以使用
@RequestMapping("/hi2")
@FeignClient(name = "SERVICE-HI")
public interface ChenTestService {
    @RequestMapping("/test1")
    public ResultTest<String> test1();
    @RequestMapping("/test2")
    public ResultTest<String> test2();
    @RequestMapping("/test3")
    public ResultTest<String> test3();
}