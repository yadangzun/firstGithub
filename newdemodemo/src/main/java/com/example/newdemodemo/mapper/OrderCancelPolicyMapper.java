package com.example.newdemodemo.mapper;

import com.example.newdemodemo.entity.OrderCancelPolicy;
import com.example.newdemodemo.entity.OrderCancelPolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCancelPolicyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int deleteByExample(OrderCancelPolicyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int insert(OrderCancelPolicy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int insertSelective(OrderCancelPolicy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    List<OrderCancelPolicy> selectByExample(OrderCancelPolicyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    OrderCancelPolicy selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderCancelPolicy record, @Param("example") OrderCancelPolicyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByExample(@Param("record") OrderCancelPolicy record, @Param("example") OrderCancelPolicyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByPrimaryKeySelective(OrderCancelPolicy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderCancelPolicy
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    int updateByPrimaryKey(OrderCancelPolicy record);
}