package com.dr5hx.oauth2jwtsever.controller;

import cn.hutool.core.util.StrUtil;
import io.jsonwebtoken.Jwts;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * UserController class
 *
 * @author zhouc
 * date: 2020/3/25
 * Copyright (c) All Rights Reserved, 2020.
 */
@RestController
@RequestMapping("/user")
public class UserController {
//    @GetMapping("/getCurrentUser")
//    public Object getCurrentUser(Authentication authentication) {
//
//
//
//        return authentication.getPrincipal();
//    }


    @GetMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication, HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        String token = StrUtil.subAfter(header, "bearer ", false);
        return Jwts.parser()
                .setSigningKey("test_key".getBytes(StandardCharsets.UTF_8))
                .parseClaimsJws(token)
                .getBody();
    }

}