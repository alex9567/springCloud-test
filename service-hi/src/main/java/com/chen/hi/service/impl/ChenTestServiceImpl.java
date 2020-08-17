package com.chen.hi.service.impl;

import com.chen.openFeign.common.ResultTest;

import com.chen.openFeign.service.ChenTestService;
import com.chen.service.CommonService;
import com.chen.service.result.Result;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class ChenTestServiceImpl implements ChenTestService {
    @Resource
    private CommonService service;
    @Override
    public ResultTest<String> test1() {
        log.info("test1");
        return ResultTest.success("hello");
    }

    @Override
    public ResultTest<String> test2() {
        Result<String> result=  service.test1();
        log.info(new Gson().toJson(result));
        return ResultTest.success("success");
    }
}
