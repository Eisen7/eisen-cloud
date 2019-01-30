package org.eisen.zookeeperClient;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
public class Application {
}
