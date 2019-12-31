package com.learn.mall.mbg.mapper;

import com.learn.mall.mbg.model.PmsBrand;
import com.learn.mall.mbg.model.PmsBrandExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Keith
 */

public interface PmsBrandMapper {

    /**
     * 查询条数
     *
     * @param example
     * @return int
     */
    int countByExample(PmsBrandExample example);

    /**
     * 删除
     *
     * @param example
     * @return int
     */
    int deleteByExample(PmsBrandExample example);

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
    int insert(PmsBrand record);

    /**
     * 选择性新增
     *
     * @param record
     * @return int
     */
    int insertSelective(PmsBrand record);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    /**
     * 查询
     *
     * @param example
     * @return List<PmsBrand>
     */
    List<PmsBrand> selectByExample(PmsBrandExample example);

    /**
     * id查询
     *
     * @param id
     * @return PmsBrand
     */
    PmsBrand selectByPrimaryKey(Long id);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleWithBLOBs(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     * 更新
     *
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(PmsBrand record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    /**
     * 更新
     *
     * @param record
     * @return int
     */
    int updateByPrimaryKey(PmsBrand record);
}