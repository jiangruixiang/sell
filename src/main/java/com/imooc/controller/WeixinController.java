package com.imooc.controller;

import com.imooc.utils.SslUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) throws Exception {
        log.info("进入auth方法......");
        log.info("code={}",code);

        SslUtils.ignoreSsl();
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxdd003919a259f077&secret=eb66d70a555db0b52f026a6659bb3ed3&code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        log.info("response={}",response);
    }
}
