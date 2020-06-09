package com.china.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: china wu
 * @Description: 服务消费者启动类
 * @Date: 2020/6/9 19:11
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LoadBalanceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoadBalanceConsumerApplication.class, args);
    }

    /**
     * 注入RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
