package com.learn.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: Keith
 * @Date: 2020-01-10 16:52
 * oss上传文件的回调结果
 * 回调接口中返回的数据对象，封装了上传文件的信息。
 */
public class OssCallbackResult {

    @ApiModelProperty(value = "文件名称")
    private String filename;

    @ApiModelProperty(value = "文件大小")
    private String size;

    @ApiModelProperty(value = "文件的mimeType")
    private String mimeType;

    @ApiModelProperty(value = "图片文件的宽")
    private String width;

    @ApiModelProperty(value = "图片文件的高")
    private String height;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
