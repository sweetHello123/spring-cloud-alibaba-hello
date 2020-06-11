package com.china.service.consumer.service.fallback;

import com.china.service.consumer.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/6/11 17:43
 */
@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String echo(String str) {
        return "echo fallback";
    }
}
