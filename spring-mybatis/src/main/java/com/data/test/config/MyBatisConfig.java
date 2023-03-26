package com.data.test.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yongshi
 * @date 2023/3/25 22:47
 * @Description 用于配置需要动态生成的mapper接口的路径
 */
@Configuration
@MapperScan("com/data/test/mbg/mapper")
public class MyBatisConfig {
}
