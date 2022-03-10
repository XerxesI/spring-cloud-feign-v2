package com.progile.spring.feign.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudFeignV1Application {


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignV1Application.class, args);
    }

}
