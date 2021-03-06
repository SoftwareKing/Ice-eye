package io.mycat.ice.mapping;

import io.mycat.ice.domain.IceProjIceboxInst;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface IceProjIceboxInstMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_icebox_inst
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ice_proj_icebox_inst",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_icebox_inst
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ice_proj_icebox_inst (ID, PROJECTID, ",
        "PROJECT_INSTANCE_ID, SERVER_NAME, ",
        "REPLICA, NOTE, LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{projectid,jdbcType=INTEGER}, ",
        "#{projectInstanceId,jdbcType=INTEGER}, #{serverName,jdbcType=VARCHAR}, ",
        "#{replica,jdbcType=TINYINT}, #{note,jdbcType=VARCHAR}, #{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(IceProjIceboxInst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_icebox_inst
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, PROJECTID, PROJECT_INSTANCE_ID, SERVER_NAME, REPLICA, NOTE, LAST_UPDATED",
        "from ice_proj_icebox_inst",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECTID", property="projectid", jdbcType=JdbcType.INTEGER),
        @Result(column="PROJECT_INSTANCE_ID", property="projectInstanceId", jdbcType=JdbcType.INTEGER),
        @Result(column="SERVER_NAME", property="serverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REPLICA", property="replica", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    IceProjIceboxInst selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_icebox_inst
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, PROJECTID, PROJECT_INSTANCE_ID, SERVER_NAME, REPLICA, NOTE, LAST_UPDATED",
        "from ice_proj_icebox_inst"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECTID", property="projectid", jdbcType=JdbcType.INTEGER),
        @Result(column="PROJECT_INSTANCE_ID", property="projectInstanceId", jdbcType=JdbcType.INTEGER),
        @Result(column="SERVER_NAME", property="serverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REPLICA", property="replica", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<IceProjIceboxInst> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ice_proj_icebox_inst
     *
     * @mbggenerated
     */
    @Update({
        "update ice_proj_icebox_inst",
        "set PROJECTID = #{projectid,jdbcType=INTEGER},",
          "PROJECT_INSTANCE_ID = #{projectInstanceId,jdbcType=INTEGER},",
          "SERVER_NAME = #{serverName,jdbcType=VARCHAR},",
          "REPLICA = #{replica,jdbcType=TINYINT},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IceProjIceboxInst record);
}