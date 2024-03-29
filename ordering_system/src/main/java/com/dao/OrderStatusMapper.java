package com.dao;

import com.model.OrderStatus;
import com.model.OrderStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int countByExample(OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int deleteByExample(OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer status);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int insert(OrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int insertSelective(OrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    List<OrderStatus> selectByExample(OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    OrderStatus selectByPrimaryKey(Integer status);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderStatus record);
}