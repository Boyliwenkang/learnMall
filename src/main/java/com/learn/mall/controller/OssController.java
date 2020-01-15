package com.learn.mall.controller;

import com.learn.mall.common.api.CommonResult;
import com.learn.mall.dto.OssCallbackResult;
import com.learn.mall.dto.OssPolicyResult;
import com.learn.mall.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Keith
 * @Date: 2020-01-13 16:06
 */

@Api(tags = "OssController", description = "Oss管理")
@Controller
@RequestMapping("/aliyun/oss")
public class OssController {
    @Autowired
    private OssServiceImpl ossService;

    @ApiOperation(value = "oss上传签名生成")
    @GetMapping("/policy")
    @ResponseBody
    public CommonResult<OssPolicyResult> policy(){
       OssPolicyResult result = ossService.policy();
       return CommonResult.success(result);
    }

    @ApiOperation(value = "oss上传成功回调")
    @PostMapping("callback")
    @ResponseBody
    public CommonResult<OssCallbackResult> callback(HttpServletRequest request){
        OssCallbackResult result = ossService.callback(request);
        return CommonResult.success(result);
    }
}
