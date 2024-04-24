package com.backendswf.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class Corsconfig implements webMvcConfigurer{
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*")
        .allowedOrigins("*")
        .allowedMethods("*")
        .allowCredentials(true);
    }
}