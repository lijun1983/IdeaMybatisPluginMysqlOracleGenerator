package com.yycg.dao;

import com.yycg.pojo.Basicinfo;
import com.yycg.pojo.BasicinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasicinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method correaaaaasponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int countByExample(BasicinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int deleteByExample(BasicinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int insert(Basicinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int insertSelective(Basicinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    List<Basicinfo> selectByExample(BasicinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    Basicinfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Basicinfo record, @Param("example") BasicinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Basicinfo record, @Param("example") BasicinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Basicinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASICINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Basicinfo record);
}