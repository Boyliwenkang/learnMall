package com.learn.mall.service;

import com.learn.mall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @Author: Keith
 * @Date: 2020-01-08 16:52
 * 会员浏览记录管理Service
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     * @param ids
     * @return int
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     * @param memberId
     * @return List<MemberReadHistory>
     */
    List<MemberReadHistory> list(Long memberId);
}
