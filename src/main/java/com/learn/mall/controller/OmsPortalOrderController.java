package com.learn.mall.controller;

import com.learn.mall.dto.OrderParam;
import com.learn.mall.service.OmsPortalOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Keith
 * @Date: 2020-01-09 16:25
 * 订单管理Controller
 */

@Api(tags = "OmsPortalOrderController" , description = "订单管理")
@Controller
@RequestMapping("/order")
public class OmsPortalOrderController {
    @Autowired
    private OmsPortalOrderService omsPortalOrderService;

    @ApiOperation(value = "根据购物车信息生成订单")
    @PostMapping("/generateOrder")
    @ResponseBody
    public Object generateOrder(@RequestBody OrderParam orderParam){
        return omsPortalOrderService.generateOrder(orderParam);
    }
}
