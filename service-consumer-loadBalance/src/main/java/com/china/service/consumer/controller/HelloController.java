package com.china.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: china wu
 * @Description: 消费端访问接口
 * @Date: 2020/6/9 19:17
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello/{str}")
    public String hello(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/hello/" + str, String.class);
    }
}
