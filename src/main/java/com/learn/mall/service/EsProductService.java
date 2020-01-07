package com.learn.mall.service;

import com.learn.mall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: Keith
 * @Date: 2020-01-06 09:15
 * 商品搜索管理Service
 */
public interface EsProductService {
    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据id删除商品
     *
     * @param id
     */
    void delete(Long id);

    /**
     * 根据id创建商品
     *
     * @param id
     */
    EsProduct create(Long id);

    /**
     * 批量删除商品
     *
     * @param ids
     */
    void delete(List<Long> ids);

    /**
     * 根据关键字搜索名称或者副标题
     *
     * @param keyword
     * @param pageNum
     * @param pageSize
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);
}
