package org.eisen.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("consul-client")
public interface DcFeign {

    @GetMapping("/dc")
    String consumer();

    @GetMapping("/hystrixCommandFallbackMethod")
    String hystrixCommandFallbackMethod();


}
