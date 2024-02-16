package com.example.demo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Slf4j
@Component
public class HelloService {
    public String hello(String name){
        log.info("Call hello service");
        return "Hello" +  name;
    }

    public String bye(String name){
        log.info(("Call bye service"));
        return "Bye" + name;
    }
}
