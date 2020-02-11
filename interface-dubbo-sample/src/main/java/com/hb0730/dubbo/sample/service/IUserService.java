package com.hb0730.dubbo.sample.service;

import com.hb0730.dubbo.sample.bean.UserAddress;

import java.util.List;

/**
 * <p>
 * 用户服务
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
public interface IUserService {
    /**
     * 按照用户id返回收货地址
     *
     * @param userId 用户id
     * @return 地址级
     */
    List<UserAddress> getUserAddressList(String userId);
}
