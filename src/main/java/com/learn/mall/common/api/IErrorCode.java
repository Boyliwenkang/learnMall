package com.learn.mall.common.api;

/**
 * @Author: Keith
 * @Date: 2019-12-26 11:04
 * 封装API的错误码
 */
public interface IErrorCode {
    /**
     * 获取状态码
     * @return long
     */
    long getCode();

    /**
     * 获取消息
     * @return String
     */
    String getMessage();}
