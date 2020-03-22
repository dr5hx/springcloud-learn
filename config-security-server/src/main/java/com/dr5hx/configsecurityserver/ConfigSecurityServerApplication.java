package com.dr5hx.configsecurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ConfigSecurityServerApplication class
 *
 * @author zhouc
 * date: 2020/3/23
 * Copyright (c) All Rights Reserved, 2020.
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigSecurityServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigSecurityServerApplication.class, args);
    }
}
