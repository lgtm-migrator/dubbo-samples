package com.hb0730.dubbo.provider.sample.service.impl;

import com.hb0730.dubbo.sample.bean.UserAddress;
import com.hb0730.dubbo.sample.service.IUserService;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *     1. 服务提供者注入注册中心
 *          1. 导入dubbo依赖
 *          2. 配置dubbo
 *     2. 服务消费者去注册中心订阅
 *
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
public class IUserServiceImpl implements IUserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress(1, "湖南长沙", "1", "张三", "15074446478", "false");
        UserAddress userAddress1 = new UserAddress(2, "上海", "1", "张三", "15074446478", "true");
        return Arrays.asList(userAddress, userAddress1);
    }
}
