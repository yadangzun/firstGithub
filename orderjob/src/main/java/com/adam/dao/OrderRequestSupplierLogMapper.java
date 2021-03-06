package com.adam.dao;

import com.adam.entity.OrderRequestSupplierLog;
import com.adam.entity.OrderRequestSupplierLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRequestSupplierLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int deleteByExample(OrderRequestSupplierLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int insert(OrderRequestSupplierLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int insertSelective(OrderRequestSupplierLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    List<OrderRequestSupplierLog> selectByExample(OrderRequestSupplierLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    OrderRequestSupplierLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderRequestSupplierLog record, @Param("example") OrderRequestSupplierLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int updateByExample(@Param("record") OrderRequestSupplierLog record, @Param("example") OrderRequestSupplierLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int updateByPrimaryKeySelective(OrderRequestSupplierLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderRequestSupplierLog
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    int updateByPrimaryKey(OrderRequestSupplierLog record);
}