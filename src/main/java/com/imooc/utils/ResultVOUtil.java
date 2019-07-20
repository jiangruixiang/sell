package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * @program: sell
 * @description: 返回结果工具类
 * @author: 姜瑞祥
 * @create: 2019-07-20 10:36
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCodde(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
    public static ResultVO success(){
        return success(null);
    }
    public static ResultVO error(Integer caode,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCodde(caode);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
