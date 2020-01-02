package com.learn.mall.mbg.mapper;

import com.learn.mall.mbg.model.UmsRole;
import com.learn.mall.mbg.model.UmsRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Keith
 * 后台用户角色表
 */
public interface UmsRoleMapper {
    /**
     * 查询条数
     *
     * @param example
     * @return int
     */
    int countByExample(UmsRoleExample example);

    /**
     * 删除
     *
     * @param example
     * @return int
     */
    int deleteByExample(UmsRoleExample example);

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
    int insert(UmsRole record);

    /**
     * 选择性新增
     *
     * @param record
     * @return int
     */
    int insertSelective(UmsRole record);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<UmsRole> selectByExample(UmsRoleExample example);

    /**
     * id查询
     *
     * @param id
     * @return PmsBrand
     */
    UmsRole selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(UmsRole record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(UmsRole record);
}