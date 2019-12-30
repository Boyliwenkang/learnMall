package com.learn.mall.controller;

import com.learn.mall.common.api.CommonPage;
import com.learn.mall.common.api.CommonResult;
import com.learn.mall.mbg.model.PmsBrand;
import com.learn.mall.service.PmsBrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Keith
 * @Date: 2019-12-26 11:26
 * 品牌管理Controller
 */

@Validated
@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    @Resource
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    /**
     * 展示所有数据
     */
    @GetMapping("listAll")
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.listAllBrand());
    }

    @PostMapping("/create")
    @ResponseBody
    public CommonResult createBrand(@RequestBody PmsBrand pmsBrand) {
        CommonResult commonResult;
        int count = pmsBrandService.createBrand(pmsBrand);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrand);
            LOGGER.debug("createBrand success:{}", pmsBrand);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", pmsBrand);
        }
        return commonResult;
    }

    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Long id, PmsBrand pmsBrand) {
        CommonResult commonResult;
        int count = pmsBrandService.updateBrand(id, pmsBrand);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrand);
            LOGGER.debug("createBrand success:{}", pmsBrand);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", pmsBrand);
        }
        return commonResult;
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        CommonResult commonResult;
        int count = pmsBrandService.deleteBrand(id);
        if (count == 1) {
            commonResult = CommonResult.success(id);
            LOGGER.debug("createBrand success:{}", id);
        } else {
            commonResult = CommonResult.success("操作失败");
            LOGGER.debug("createBrand failed:{}", id);
        }
        return commonResult;
    }

    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<PmsBrand> brandList = pmsBrandService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(pmsBrandService.getBrand(id));
    }

}
