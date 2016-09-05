package com.dao;

import com.model.AgentRetailer;
import com.model.AgentRetailerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentRetailerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agent_retailer
     *
     * @mbggenerated
     */
    int countByExample(AgentRetailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agent_retailer
     *
     * @mbggenerated
     */
    int deleteByExample(AgentRetailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agent_retailer
     *
     * @mbggenerated
     */
    int insert(AgentRetailer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agent_retailer
     *
     * @mbggenerated
     */
    int insertSelective(AgentRetailer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agent_retailer
     *
     * @mbggenerated
     */
    List<AgentRetailer> selectByExample(AgentRetailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agent_retailer
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AgentRetailer record, @Param("example") AgentRetailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agent_retailer
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AgentRetailer record, @Param("example") AgentRetailerExample example);
}