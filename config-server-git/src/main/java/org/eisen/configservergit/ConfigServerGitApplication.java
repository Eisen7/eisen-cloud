package org.eisen.configservergit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author Eisen
 * @Date 2019/1/9 21:05
 * @Description:
 **/
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerGitApplication.class).run(args);
    }

}
