package com.dr5hx.turbineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * TurbineServiceApplication class
 *
 * @author zhouc
 * date: 2020/3/21
 * Copyright (c) All Rights Reserved, 2020.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class TurbineServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineServiceApplication.class, args);
    }
}
