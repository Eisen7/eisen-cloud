package org.eisen.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Eisen
 * @Date 2019/1/9 21:42
 * @Description:
 **/
//@RestController
public class ConfigController {


//    @RequestMapping("/info")
    public String s(@Value("info") String s) {
        return s;
    }
}
