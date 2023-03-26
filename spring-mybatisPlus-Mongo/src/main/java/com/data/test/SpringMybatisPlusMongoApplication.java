package com.data.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yongshi
 */
@SpringBootApplication
@MapperScan("com.data.test.mapper")
public class SpringMybatisPlusMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisPlusMongoApplication.class, args);
    }

}
