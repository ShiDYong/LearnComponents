package com.data.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yongshi
 */
@SpringBootApplication(scanBasePackages = {"com.data.test"})
public class SpringMysqlMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMysqlMongoApplication.class, args);
    }

}
