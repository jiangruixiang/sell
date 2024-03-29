package com.imooc.enums;

import lombok.Getter;

/**
 * Created by 姜瑞祥
 * 2019年7月20日 13:52:03
 */
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
