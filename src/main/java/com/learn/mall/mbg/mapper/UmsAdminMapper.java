package com.learn.mall.mbg.mapper;

import com.learn.mall.mbg.model.UmsAdmin;
import com.learn.mall.mbg.model.UmsAdminExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Keith
 * 后台用户表
 */

public interface UmsAdminMapper {
    /**
     * 查询条数
     *
     * @param example
     * @return int
     */
    int countByExample(UmsAdminExample example);

    /**
     * 删除
     *
     * @param example
     * @return int
     */
    int deleteByExample(UmsAdminExample example);

    /**
     * 根据Id删除
     *
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增
     *
     * @param record
     * @return int
     */
    int insert(UmsAdmin record);

    /**
     * 选择性新增
     *
     * @param record
     * @return int
     */
    int insertSelective(UmsAdmin record);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<UmsAdmin> selectByExample(UmsAdminExample example);

    /**
     * id查询
     *
     * @param id
     * @return PmsBrand
     */
    UmsAdmin selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(UmsAdmin record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(UmsAdmin record);
}