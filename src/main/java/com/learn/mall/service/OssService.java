package com.learn.mall.service;

import com.learn.mall.dto.OssCallbackResult;
import com.learn.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Keith
 * @Date: 2020-01-10 16:59
 * oss上传管理Service
 */
public interface OssService {

    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
