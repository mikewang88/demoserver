package com.dougwang.demoserver.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: MikeWang
 * @Date: 2020/3/4 5:27 PM
 * @Description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
