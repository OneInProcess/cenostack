package com.cenostack.ms.devops.dao;

import com.cenostack.ms.devops.entity.GitUserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GitUserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devops_git_user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from devops_git_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devops_git_user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into devops_git_user (id, developer_id, ",
        "git_user_name, git_user_pwd, ",
        "last_modify_time, create_time)",
        "values (#{id,jdbcType=INTEGER}, #{developerId,jdbcType=INTEGER}, ",
        "#{gitUserName,jdbcType=VARCHAR}, #{gitUserPwd,jdbcType=VARCHAR}, ",
        "#{lastModifyTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(GitUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devops_git_user
     *
     * @mbg.generated
     */
    int insertSelective(GitUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devops_git_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, developer_id, git_user_name, git_user_pwd, last_modify_time, create_time",
        "from devops_git_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.jd.dkh.ms.devops.dao.GitUserEntityMapper.BaseResultMap")
    GitUserEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devops_git_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GitUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devops_git_user
     *
     * @mbg.generated
     */
    @Update({
        "update devops_git_user",
        "set developer_id = #{developerId,jdbcType=INTEGER},",
          "git_user_name = #{gitUserName,jdbcType=VARCHAR},",
          "git_user_pwd = #{gitUserPwd,jdbcType=VARCHAR},",
          "last_modify_time = #{lastModifyTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GitUserEntity record);

    @Select({
            "select",
            "id, developer_id, git_user_name, git_user_pwd, last_modify_time, create_time",
            "from devops_git_user",
            "where git_user_name = #{gitUser,jdbcType=VARCHAR}"
    })
    @ResultMap("com.jd.dkh.ms.devops.dao.GitUserEntityMapper.BaseResultMap")
    GitUserEntity selectByUser(String gitUser);
}