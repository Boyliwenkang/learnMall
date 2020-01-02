package com.learn.mall.mbg.mapper;

import com.learn.mall.mbg.model.UmsPermission;
import com.learn.mall.mbg.model.UmsPermissionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Keith
 * 后台用户权限表
 */
public interface UmsPermissionMapper {
    /**
     * 查询条数
     *
     * @param example
     * @return int
     */
    int countByExample(UmsPermissionExample example);

    /**
     * 删除
     *
     * @param example
     * @return int
     */
    int deleteByExample(UmsPermissionExample example);

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
    int insert(UmsPermission record);

    /**
     * 选择性新增
     *
     * @param record
     * @return int
     */
    int insertSelective(UmsPermission record);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<UmsPermission> selectByExample(UmsPermissionExample example);

    /**
     * id查询
     *
     * @param id
     * @return PmsBrand
     */
    UmsPermission selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(UmsPermission record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(UmsPermission record);
}