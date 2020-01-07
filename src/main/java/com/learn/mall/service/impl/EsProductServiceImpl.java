package com.learn.mall.service.impl;

import com.learn.mall.dao.EsProductDao;
import com.learn.mall.nosql.elasticsearch.document.EsProduct;
import com.learn.mall.nosql.elasticsearch.repository.EsProductRepository;
import com.learn.mall.service.EsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Keith
 * @Date: 2020-01-06 09:25
 * 商品搜索管理Service实现类
 */
@Service
public class EsProductServiceImpl implements EsProductService {
    @Autowired
    private EsProductRepository productRepository;
    @Autowired
    private EsProductDao esProductDao;

    @Override
    public int importAll() {
        List<EsProduct> esProductList = esProductDao.getAllEsProductList(null);
        Iterable<EsProduct> esProductIterable = productRepository.saveAll(esProductList);
        Iterator<EsProduct> iterator = esProductIterable.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            result++;
            iterator.next();
        }
        return result;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public EsProduct create(Long id) {
        EsProduct result = null;
        List<EsProduct> esProductList = esProductDao.getAllEsProductList(id);
        if (esProductList.size() > 0) {
            EsProduct esProduct = esProductList.get(0);
            result = productRepository.save(esProduct);
        }
        return result;
    }

    @Override
    public void delete(List<Long> ids) {
        if (!CollectionUtils.isEmpty(ids)) {
            List<EsProduct> esProductList = new ArrayList<>();
            if (esProductList.size() > 0) {
                for (Long id : ids) {
                    EsProduct esProduct = new EsProduct();
                    esProduct.setId(id);
                    esProductList.add(esProduct);
                }
            }
            productRepository.deleteAll(esProductList);
        }
    }

    @Override
    public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return productRepository.findByNameOrSubTitleOrKeywords(keyword, keyword, keyword, pageable);
    }
}
