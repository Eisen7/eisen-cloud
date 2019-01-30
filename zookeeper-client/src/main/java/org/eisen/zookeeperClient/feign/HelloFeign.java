package org.eisen.zookeeperClient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-zookeeper")
public interface HelloFeign {
    @GetMapping("/hello")
    String hello();
}
