package com.lxp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description :
 * @Author lxp
 * @Date 2017/12/7- 17:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceTwoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceTwoApplication.class, args);
    }
}