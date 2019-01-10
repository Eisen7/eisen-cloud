package org.eisen.consulclient;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

//@EnableDiscoveryClient
//@SpringBootApplication
@SpringCloudApplication
public class ConsulClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulClientApplication.class).run(args);
    }
}