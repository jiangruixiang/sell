package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/*
 * @Author 姜瑞祥
 * @Description 类目
 * @Date  10:58 2019/7/19
 **/
public interface CategoryService {
    ProductCategory findById(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn (List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
