package com.jt666;

import com.jt666.netty.DiscardServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
//接口层不用添加注解
@MapperScan("com.jt666.mapper")
public class Jt666Application implements CommandLineRunner {

    @Resource
    private DiscardServer discardServer;

    public static void main(String[] args) {

        SpringApplication.run(Jt666Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //discardServer run方法
        discardServer.run(20049);
    }
}
