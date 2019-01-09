package org.eisen.configclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Author Eisen
 * @Date 2019/1/9 21:31
 * @Description:
 **/
@SpringBootApplication
public class ConfigClientGitApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientGitApplication.class).run(args);
    }
}
