package com.learn.mall.dao;

import com.learn.mall.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Keith
 * @Date: 2020-01-06 09:28
 * 搜索系统中的商品管理自定义Dao
 */
public interface EsProductDao {

    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
