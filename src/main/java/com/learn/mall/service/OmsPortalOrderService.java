package com.learn.mall.service;

import com.learn.mall.common.api.CommonResult;
import com.learn.mall.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Keith
 * @Date: 2020-01-09 15:48
 * 前台订单管理Service
 */

public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

}
