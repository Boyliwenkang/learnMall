package com.learn.mall.service;

import com.learn.mall.common.api.CommonResult;

/**
 * @Author: Keith
 * @Date: 2019-12-31 16:19
 * 会员管理Service
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String autoCode);
}
