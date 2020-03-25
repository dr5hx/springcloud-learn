package com.dr5hx.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * FallbackController class
 *
 * @author zhouc
 * date: 2020/3/24
 * Copyright (c) All Rights Reserved, 2020.
 */
@RestController
public class FallbackController {


    @GetMapping("/fallback")
    public Object fallback() {
        Map<String, Object> result = new HashMap<>();
        result.put("data", null);
        result.put("message", "Get request fallback!");
        result.put("code", 500);
        return result;
    }
}
