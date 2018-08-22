package yycg.business.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.business.pojo.po.Ypxx;
import yycg.business.pojo.po.YpxxExample;

public interface YpxxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int countByExample(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int deleteByExample(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int insert(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int insertSelective(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    List<Ypxx> selectByExampleWithBLOBs(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    List<Ypxx> selectByExample(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    Ypxx selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Ypxx record, @Param("example") YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Ypxx record, @Param("example") YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Ypxx record, @Param("example") YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table YPXX
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Ypxx record);
}