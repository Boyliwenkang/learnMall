package com.learn.mall.service;

import com.learn.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: Keith
 * @Date: 2019-12-26 11:39
 * PmsBrandService
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand pmsBrand);

    int updateBrand(Long id, PmsBrand pmsBrand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
