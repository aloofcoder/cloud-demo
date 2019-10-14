package com.github.aloofcoder.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@EnableEurekaClient
@SpringBootApplication
public class HiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiServerApplication.class, args);
    }

}
