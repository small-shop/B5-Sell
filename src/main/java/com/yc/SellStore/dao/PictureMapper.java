package com.yc.SellStore.dao;

import com.yc.SellStore.bean.Picture;
import com.yc.SellStore.bean.PictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    long countByExample(PictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int deleteByExample(PictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int insert(Picture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int insertSelective(Picture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    List<Picture> selectByExample(PictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    Picture selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int updateByPrimaryKeySelective(Picture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table picture
     *
     * @mbg.generated Tue May 14 21:04:47 CST 2019
     */
    int updateByPrimaryKey(Picture record);
}