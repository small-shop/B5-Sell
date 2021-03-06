package com.yc.SellStore.dao;

import com.yc.SellStore.bean.Admininfo;
import com.yc.SellStore.bean.AdmininfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdmininfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    long countByExample(AdmininfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int deleteByExample(AdmininfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int deleteByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int insert(Admininfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int insertSelective(Admininfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    List<Admininfo> selectByExample(AdmininfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    Admininfo selectByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") Admininfo record, @Param("example") AdmininfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int updateByExample(@Param("record") Admininfo record, @Param("example") AdmininfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int updateByPrimaryKeySelective(Admininfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admininfo
     *
     * @mbg.generated Tue May 14 21:18:04 CST 2019
     */
    int updateByPrimaryKey(Admininfo record);
}