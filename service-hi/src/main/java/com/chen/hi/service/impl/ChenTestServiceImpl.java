package com.chen.hi.service.impl;

import com.chen.openFeign.common.ResultTest;

import com.chen.openFeign.service.ChenTestService;
import com.chen.service.CommonService;
import com.chen.service.requestDTO.TestHelloRequestDTO;
import com.chen.service.result.Result;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

//如果没有下载我的另一个项目，需要删除整个类，因为没有其他微服务可以使用
@Slf4j
@RestController
public class ChenTestServiceImpl implements ChenTestService {
    @Resource
    private CommonService service;

    @Override
    public ResultTest<String> test1() {
        Result<String> result = service.test1();
        log.info(new Gson().toJson(result));
        log.info("test1");
        return ResultTest.success("hello");
    }

    @Override
    public ResultTest<String> test2() {
        Result<String> result = service.test1();
        log.info(new Gson().toJson(result));
        return ResultTest.success("success");
    }

    //如果没有下载我的另一个项目，需要注释这个方法，因为没有其他微服务可以使用
    @Override
    public ResultTest<String> test3() {
        TestHelloRequestDTO testHelloRequestDTO = new TestHelloRequestDTO();
        testHelloRequestDTO.setAge(1);
        testHelloRequestDTO.setName("111");
        Result<String> result = service.test3(testHelloRequestDTO);
        log.info(new Gson().toJson(result));
        return ResultTest.success("success");
    }
}
