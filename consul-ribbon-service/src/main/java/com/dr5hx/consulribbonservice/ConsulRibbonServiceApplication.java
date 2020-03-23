package com.dr5hx.consulribbonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsulRibbonServiceApplication class
 *
 * @author zhouc
 * date: 2020/3/21
 * Copyright (c) All Rights Reserved, 2020.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulRibbonServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulRibbonServiceApplication.class, args);
    }
}
