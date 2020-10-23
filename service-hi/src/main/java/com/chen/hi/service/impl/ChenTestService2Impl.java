package com.chen.hi.service.impl;

import com.chen.openFeign.common.ResultTest;
import com.chen.openFeign.service.ChenTestService2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class ChenTestService2Impl implements ChenTestService2 {


    @Override
    public ResultTest<String> test1() {
        log.info("test1");
        return ResultTest.success("hello");
    }

    @Override
    public ResultTest<String> test2() {
        log.info("test2");
        return ResultTest.success("success");
    }

    @Override
    public ResultTest<String> test3() {
        log.info("test3");
        return ResultTest.success("success");
    }
}
