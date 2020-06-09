package com.china.service.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: china wu
 * @Description: 服务端访问接口
 * @Date: 2020/6/9 18:23
 */
@RestController
public class HelloController {

    @GetMapping("/hello/{str}")
    public String echo(@PathVariable String str) {
        return "Hello Nacos Provider " + str;
    }
}
