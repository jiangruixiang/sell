package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 *Created by 姜瑞祥
 * 2019年8月5日 13:45:41
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
