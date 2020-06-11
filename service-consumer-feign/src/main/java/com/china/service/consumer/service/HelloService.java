package com.china.service.consumer.service;

import com.china.service.consumer.service.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/6/11 15:08
 */
@FeignClient(value = "service-provider",fallback = HelloServiceFallback.class)
public interface HelloService {

    @GetMapping("/hello/{str}")
    String echo(@PathVariable String str);
}
