package com.mk.dist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DistLockApp {
    public static void main(String[] args) {
        SpringApplication.run(DistLockApp.class, args);
        log.info("DistLockApp 启动完成");
    }

}