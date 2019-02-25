package com.example.newdemodemo.mapper;

import com.example.newdemodemo.entity.OrderExtendInfo;
import com.example.newdemodemo.entity.OrderExtendInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderExtendInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int deleteByExample(OrderExtendInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int insert(OrderExtendInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int insertSelective(OrderExtendInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    List<OrderExtendInfo> selectByExample(OrderExtendInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    OrderExtendInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderExtendInfo record, @Param("example") OrderExtendInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByExample(@Param("record") OrderExtendInfo record, @Param("example") OrderExtendInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByPrimaryKeySelective(OrderExtendInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderExtendInfo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByPrimaryKey(OrderExtendInfo record);
}