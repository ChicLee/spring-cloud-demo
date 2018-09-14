package com.lxp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ Description：Eureka 服务发现server 启动类
 * @ Author     ：Chic Lee
 * @ Date       ：Created in 23:17 2018/9/14
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DiscoveryApplication.class, args);
    }

}