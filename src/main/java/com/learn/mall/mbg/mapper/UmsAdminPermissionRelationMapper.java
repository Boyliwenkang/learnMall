package com.learn.mall.mbg.mapper;

import com.learn.mall.mbg.model.UmsAdminPermissionRelation;
import com.learn.mall.mbg.model.UmsAdminPermissionRelationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Keith
 * 后台用户和权限关系表
 */
public interface UmsAdminPermissionRelationMapper {
    /**
     * 查询条数
     *
     * @param example
     * @return int
     */
    int countByExample(UmsAdminPermissionRelationExample example);

    /**
     * 删除
     *
     * @param example
     * @return int
     */
    int deleteByExample(UmsAdminPermissionRelationExample example);

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
    int insert(UmsAdminPermissionRelation record);

    /**
     * 选择性新增
     *
     * @param record
     * @return int
     */
    int insertSelective(UmsAdminPermissionRelation record);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<UmsAdminPermissionRelation> selectByExample(UmsAdminPermissionRelationExample example);

    /**
     * id查询
     *
     * @param id
     * @return PmsBrand
     */
    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(UmsAdminPermissionRelation record);
}