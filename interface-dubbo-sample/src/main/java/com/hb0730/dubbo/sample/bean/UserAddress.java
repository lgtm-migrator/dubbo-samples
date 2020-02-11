package com.hb0730.dubbo.sample.bean;

import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 用户地址
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserAddress implements Serializable {
    /**
     * id
     */
    private Integer id;
    /**
     * 用户地址
     */
    private String userAddress;
    /**
     * 用户地址
     */
    private String userId;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 手机号码
     */
    private String phoneNum;
    /**
     * 是否默认
     */
    private String idDefault;

}
