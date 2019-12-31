package com.learn.mall.mbg.mapper;

import com.learn.mall.mbg.model.UmsMember;
import com.learn.mall.mbg.model.UmsMemberExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Keith
 * 会员管理
 */
public interface UmsMemberMapper {

    /**
     * 查询条数
     *
     * @param example
     * @return int
     */
    int countByExample(UmsMemberExample example);

    /**
     * 删除
     *
     * @param example
     * @return int
     */
    int deleteByExample(UmsMemberExample example);

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
    int insert(UmsMember record);

    /**
     * 选择性新增
     *
     * @param record
     * @return int
     */
    int insertSelective(UmsMember record);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<UmsMember> selectByExample(UmsMemberExample example);

    /**
     * id查询
     *
     * @param id
     * @return PmsBrand
     */
    UmsMember selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(UmsMember record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(UmsMember record);
}