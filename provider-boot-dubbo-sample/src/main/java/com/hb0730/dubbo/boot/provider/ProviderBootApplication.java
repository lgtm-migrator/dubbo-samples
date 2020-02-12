package com.hb0730.dubbo.boot.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 1. 导入依赖
 * 1. 导入dubbo-starter
 * 2. 导入dubbo其他依赖
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@SpringBootApplication
@EnableDubbo
public class ProviderBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderBootApplication.class, args);
    }
}
