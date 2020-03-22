package com.dr5hx.eurekasecurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaSecurityServer class
 *
 * @author zhouc
 * date: 2020/3/21
 * Copyright (c) All Rights Reserved, 2020.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaSecurityServer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSecurityServer.class, args);
    }
}
