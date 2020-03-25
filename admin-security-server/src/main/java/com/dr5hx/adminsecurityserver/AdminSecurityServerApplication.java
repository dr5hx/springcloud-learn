package com.dr5hx.adminsecurityserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * AdminSecurityServerApplication class
 *
 * @author zhouc
 * date: 2020/3/25
 * Copyright (c) All Rights Reserved, 2020.
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class AdminSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminSecurityServerApplication.class, args);
    }

}