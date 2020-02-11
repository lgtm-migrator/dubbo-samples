package com.hb0730.dubbo.sample.service;

/**
 * <p>
 * 订单服务
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
public interface IOrderService {
    /**
     * 初始化用户订单
     *
     * @param userId 用户id
     */
    void initOrder(String userId);
}
