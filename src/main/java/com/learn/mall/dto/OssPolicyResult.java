package com.learn.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: Keith
 * @Date: 2020-01-10 16:33
 * 获取OSS上传文件授权返回结果
 */
public class OssPolicyResult {

    @ApiModelProperty(value = "访问身份验证中用到用户标识")
    private String accessKeyId;

    @ApiModelProperty(value = "用户表单上传的策略,经过base64编码过的字符串")
    private String policy;

    @ApiModelProperty(value = "对policy签名后的字符串")
    private String signature;

    @ApiModelProperty(value = "上传文件夹路径前缀")
    private String dir;

    @ApiModelProperty(value = "oss对外服务的访问域名")
    private String host;

    @ApiModelProperty(value = "上传成功后的回调设置")
    private String callback;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
