package com.adam.dao;

import com.adam.entity.OrderAmount;
import com.adam.entity.OrderAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAmountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int deleteByExample(OrderAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int insert(OrderAmount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int insertSelective(OrderAmount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    List<OrderAmount> selectByExample(OrderAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    OrderAmount selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderAmount record, @Param("example") OrderAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int updateByExample(@Param("record") OrderAmount record, @Param("example") OrderAmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int updateByPrimaryKeySelective(OrderAmount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderAmount
     *
     * @mbggenerated Thu Feb 21 12:04:24 CST 2019
     */
    int updateByPrimaryKey(OrderAmount record);
}