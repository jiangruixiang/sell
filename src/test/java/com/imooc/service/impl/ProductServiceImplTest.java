package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


/*
 * @Author 姜瑞祥
 * @Description 商品信息Service单元测试
 * @Date  15:02 2019/7/19
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findById() {
        ProductInfo productInfo = productService.findById("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() {
        /*new PageRequest(0，2)，已经过时，用PageRequest.of(0,2);代替*/
        PageRequest request = PageRequest.of(0,2);
        Page<ProductInfo> productInfoPage =  productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo("123457","皮皮虾",new BigDecimal(3.2),100,"很好吃的虾","http://xxx.jpg", ProductStatusEnum.DOWN.getCode(),2);
        ProductInfo result = productService.save(productInfo);
        System.out.println(productInfo);
        Assert.assertNotNull(result);
    }
}