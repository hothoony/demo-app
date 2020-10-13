package com.example.demo.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Getter @Setter
@RestController
public class HelloController {

    private String name;

    @GetMapping("/hello")
    public String hello() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String result = "hello " + request.getLocalAddr() + " " + Math.random();
        log.info(result);
        return result;
    }

    @GetMapping("/test")
    public String test() {
        for (int i = 0; i < 100000; i++) {

        }
        String result = "test " + Math.random();
        log.info(result);
        return result;
    }
}
