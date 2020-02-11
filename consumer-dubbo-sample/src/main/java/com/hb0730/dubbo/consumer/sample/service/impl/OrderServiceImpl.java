package com.hb0730.dubbo.consumer.sample.service.impl;

import com.hb0730.dubbo.sample.bean.UserAddress;
import com.hb0730.dubbo.sample.service.IOrderService;
import com.hb0730.dubbo.sample.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IUserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
