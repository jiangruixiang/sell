package com.imooc.enums;

import lombok.Getter;

/*
 * @Author 姜瑞祥
 * @Description 商品装态
 * @Date  14:52 2019/7/19
 **/
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
