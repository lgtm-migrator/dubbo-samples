package com.hb0730.dubbo.boot.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@SpringBootApplication
@EnableDubbo
public class ConsumerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBootApplication.class, args);
    }
}
