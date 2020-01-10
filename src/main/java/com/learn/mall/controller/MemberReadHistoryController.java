package com.learn.mall.controller;

import com.learn.mall.common.api.CommonResult;
import com.learn.mall.nosql.mongodb.document.MemberReadHistory;
import com.learn.mall.service.MemberReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Keith
 * @Date: 2020-01-08 17:25
 * 会员商品浏览记录管理Controller
 */

@Api(tags = "MemberReadHistoryController", description = "会员商品浏览记录管理")
@Controller
@RequestMapping("/member/readHistory")
@Validated
public class MemberReadHistoryController {
    @Autowired
    MemberReadHistoryService memberReadHistoryService;

    @ApiOperation(value = "创建浏览记录")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) {
        int count = memberReadHistoryService.create(memberReadHistory);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "删除浏览记录")
    @PostMapping("/delete")
    @ResponseBody
    public CommonResult delete(@RequestBody List<String> ids) {
        int count = memberReadHistoryService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "展示浏览记录")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<List<MemberReadHistory>> list(Long memberId) {
        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
        return CommonResult.success(memberReadHistoryList);
    }

}
