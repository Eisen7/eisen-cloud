package org.eisen.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.eisen.consumer.feign.DcFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }


    @Autowired
    DcFeign dcFeign;

    @GetMapping("/feign")
    public String dcFeign() {
       return dcFeign.consumer();
    }

    @GetMapping("/hystrixCommandFallbackMethod")
    @HystrixCommand(fallbackMethod = "fallback")
    public String hystrixCommandFallbackMethod() {
        return dcFeign.hystrixCommandFallbackMethod();
    }


    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/fallback")
    public String consumer(@Value("id") String id) {
        return restTemplate.getForObject("http://192.168.0.119:2002/dc", String.class);
    }

    public String fallback() {
        return "fallback";
    }
    public String fallback(String id) {
        return id;
    }

}
