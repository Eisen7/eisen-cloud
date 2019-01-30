package org.eisen.zookeeperClient.controller;

import org.eisen.zookeeperClient.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloFeign feign;

    @RequestMapping("/hello")
    public String hello() {
        return feign.hello();
    }

}
