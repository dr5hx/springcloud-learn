package com.dr5hx.configserver.filter;

import com.dr5hx.configserver.ConfigServerApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * MyFilter class
 *
 * @author zhouc
 * date: 2020/3/22
 * Copyright (c) All Rights Reserved, 2020.
 */
@WebFilter(urlPatterns = "/*", asyncSupported = true)
@Configuration
public class MyFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ObjectMapper objectMapper = new ObjectMapper();
        logger.info("where is data:"+ objectMapper.writeValueAsString(servletRequest.getParameterMap()));
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
        }
    }

    @Override
    public void destroy() {

    }
}
