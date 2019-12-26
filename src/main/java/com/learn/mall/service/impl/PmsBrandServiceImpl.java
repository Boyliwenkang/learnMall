package com.learn.mall.service.impl;

import com.learn.mall.mbg.mapper.PmsBrandMapper;
import com.learn.mall.mbg.model.PmsBrand;
import com.learn.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Keith
 * @Date: 2019-12-26 11:52
 * PmsBrandService实现类
 */
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return null;
    }

    @Override
    public int createBrand(PmsBrand pmsBrand) {
        return 0;
    }

    @Override
    public int updateBrand(Long id, PmsBrand pmsBrand) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}
