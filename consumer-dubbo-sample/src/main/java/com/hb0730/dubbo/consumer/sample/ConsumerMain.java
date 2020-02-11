package com.hb0730.dubbo.consumer.sample;

import com.hb0730.dubbo.sample.service.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * <p>
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
public class ConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        IOrderService service = context.getBean(IOrderService.class);
        service.initOrder("1");
        System.in.read();
    }
}
