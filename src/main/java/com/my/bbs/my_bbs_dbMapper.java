package com.my.bbs;

import com.my.bbs.my_bbs_db;
import com.my.bbs.my_bbs_dbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface my_bbs_dbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    long countByExample(my_bbs_dbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int deleteByExample(my_bbs_dbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int deleteByPrimaryKey(Long postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int insert(my_bbs_db record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int insertSelective(my_bbs_db record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    List<my_bbs_db> selectByExampleWithBLOBs(my_bbs_dbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    List<my_bbs_db> selectByExample(my_bbs_dbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    my_bbs_db selectByPrimaryKey(Long postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int updateByExampleSelective(@Param("record") my_bbs_db record, @Param("example") my_bbs_dbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("record") my_bbs_db record, @Param("example") my_bbs_dbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int updateByExample(@Param("record") my_bbs_db record, @Param("example") my_bbs_dbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int updateByPrimaryKeySelective(my_bbs_db record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(my_bbs_db record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_bbs_post
     *
     * @mbg.generated Thu May 09 15:43:31 CST 2024
     */
    int updateByPrimaryKey(my_bbs_db record);
}