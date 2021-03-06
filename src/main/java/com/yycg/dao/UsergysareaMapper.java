package com.yycg.dao;

import com.yycg.pojo.Usergysarea;
import com.yycg.pojo.UsergysareaExample;
import com.yycg.pojo.UsergysareaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergysareaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int countByExample(UsergysareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int deleteByExample(UsergysareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(UsergysareaKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int insert(Usergysarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int insertSelective(Usergysarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    List<Usergysarea> selectByExample(UsergysareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    Usergysarea selectByPrimaryKey(UsergysareaKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Usergysarea record, @Param("example") UsergysareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Usergysarea record, @Param("example") UsergysareaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Usergysarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYSAREA
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Usergysarea record);
}