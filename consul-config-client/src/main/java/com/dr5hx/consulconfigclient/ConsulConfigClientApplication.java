package com.dr5hx.consulconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsulConfigClientApplication class
 *
 * @author zhouc
 * date: 2020/3/23
 * Copyright (c) All Rights Reserved, 2020.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigClientApplication.class, args);
    }
}
