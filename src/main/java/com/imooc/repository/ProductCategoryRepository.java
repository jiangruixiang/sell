package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Created by 姜瑞祥
 * 2019-07-17 15:06
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

   /* List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);*/
}
