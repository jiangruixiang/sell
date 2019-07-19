package com.imooc.VO;

import lombok.Data;

@Data
public class ResultVO<T> {
    /*错误码*/
    private Integer codde;

    /*提示信息*/
    private String msg;

    /*具体内容*/
    private T data;
}
