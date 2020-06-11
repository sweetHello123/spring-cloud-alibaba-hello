package com.china.service.consumer.controller;

import com.china.service.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/6/11 15:08
 */
@RefreshScope // 开启动态刷新配置
@RestController
@RequestMapping("/feign")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Value("${user.name}")
    private String username;

    @GetMapping("/hello")
    public String hello(String str) {
        return helloService.echo(str);
    }

    @GetMapping("/echo")
    public String echo() {
        return helloService.echo(username);
    }
}
