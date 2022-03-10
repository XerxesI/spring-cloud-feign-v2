package com.progile.spring.feign.api.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;


public class UserConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }


    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("clearing-issuing", "9088cdc5-4d76-4494-9ef6-60dee2bb2e2f");
    }
//    @Bean
//    public RequestInterceptor requestInterceptor() {
//        return requestTemplate -> {
//            requestTemplate.header("Username", "clearing-issuing");
//            requestTemplate.header("Password", "9088cdc5-4d76-4494-9ef6-60dee2bb2e2f");
//            requestTemplate.header("Accept", ContentType.APPLICATION_JSON.getMimeType());
//        };
//    }
}
