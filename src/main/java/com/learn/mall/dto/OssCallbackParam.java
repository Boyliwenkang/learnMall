package com.learn.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: Keith
 * @Date: 2020-01-10 16:38
 * oss上传成功后的回调参数
 */
public class OssCallbackParam {

    @ApiModelProperty(value = "请求的回调地址")
    private String callbackUrl;

    @ApiModelProperty(value = "回调是传入request中的参数")
    private String callbackBody;

    @ApiModelProperty(value = "回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackBody() {
        return callbackBody;
    }

    public void setCallbackBody(String callbackBody) {
        this.callbackBody = callbackBody;
    }

    public String getCallbackBodyType() {
        return callbackBodyType;
    }

    public void setCallbackBodyType(String callbackBodyType) {
        this.callbackBodyType = callbackBodyType;
    }
}
