package com.aawprojetos.AV1.service;

import org.springframework.stereotype.Service;
@Service
public class HelloService {
    public String getHello(String name) {
        return "Hello ".formatted(name);
    }
}