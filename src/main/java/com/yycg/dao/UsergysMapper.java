package com.yycg.dao;

import com.yycg.pojo.Usergys;
import com.yycg.pojo.UsergysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergysMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int countByExample(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int deleteByExample(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int insert(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int insertSelective(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    List<Usergys> selectByExampleWithBLOBs(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    List<Usergys> selectByExample(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    Usergys selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Usergys record, @Param("example") UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Usergys record, @Param("example") UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Usergys record, @Param("example") UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERGYS
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Usergys record);
}