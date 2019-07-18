package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import com.imooc.SellApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/*
 * @Author 姜瑞祥
 * @Date  15:11 2019/7/17
 * @SpringBootConfiguration
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private  ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        //ProductCategory productCategory = repository.findOne(1);jpa版本问题，此方法弃用，用如下方法
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
        System.out.println("hello world");
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",5);
        ProductCategory result = repository.save(productCategory);
        //断言，为空不往下执行
        Assert.assertNotNull(result);
        System.out.println("hello world");
    }
}