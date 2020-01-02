package com.learn.mall.mbg.mapper;

import com.learn.mall.mbg.model.UmsAdminRoleRelation;
import com.learn.mall.mbg.model.UmsAdminRoleRelationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Keith
 * 后台用户和角色关系表
 */
public interface UmsAdminRoleRelationMapper {
    /**
     * 查询条数
     *
     * @param example
     * @return int
     */
    int countByExample(UmsAdminRoleRelationExample example);

    /**
     * 删除
     *
     * @param example
     * @return int
     */
    int deleteByExample(UmsAdminRoleRelationExample example);

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
    int insert(UmsAdminRoleRelation record);

    /**
     * 选择性新增
     *
     * @param record
     * @return int
     */
    int insertSelective(UmsAdminRoleRelation record);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    /**
     * id查询
     *
     * @param id
     * @return PmsBrand
     */
    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(UmsAdminRoleRelation record);
}