package com.imooc.dto;

import lombok.Data;

/**
 * @program: sell
 * @description:购物车
 * @author: 姜瑞祥
 * @create: 2019-07-20 16:36
 **/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
