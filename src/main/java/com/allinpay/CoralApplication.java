package com.allinpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.allinpay.repository.mapper")
@EnableScheduling
public class CoralApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoralApplication.class, args);
    }

}
