package com.aawprojetos.AV1.controller;

import com.aawprojetos.AV1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return helloService.getHello(name);
    }
}
