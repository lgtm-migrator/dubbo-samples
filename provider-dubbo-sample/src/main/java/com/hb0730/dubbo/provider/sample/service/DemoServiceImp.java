package com.hb0730.dubbo.provider.sample.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@Service(version = "1.0.0")
public class DemoServiceImp implements IDemoService {
    @Override
    public String sayHi(String message) {
        return "[echo] Hello, " + message;
    }
}
