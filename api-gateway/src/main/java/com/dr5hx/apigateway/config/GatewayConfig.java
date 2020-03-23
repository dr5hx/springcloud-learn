package com.dr5hx.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * GatewayConfig class
 *
 * @author zhouc
 * date: 2020/3/23
 * Copyright (c) All Rights Reserved, 2020.
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route1", r -> r.path("/user/getByUsername")
                        .uri("http://localhost:8200/user/getByUsername"))
                .build();
    }
}

