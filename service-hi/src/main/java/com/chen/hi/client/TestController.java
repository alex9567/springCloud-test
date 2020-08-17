package com.chen.hi.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/controller")
public class TestController {
    @RequestMapping("/test")
    public String test(String name) {
        log.info("Parmas:{}",name);
        String b = name;
        String c = name;
        return c+b;
    }
    @RequestMapping("/test2")
    public String test2(String name) {
        for(int i=0;i<100000;i++){
            log.info("Parmas:{}",i);
        }
        return "ok";
    }
    @RequestMapping("/test3")
    public String test3(String name) {
        int x = 1/0;
        return "ok";
    }
}
