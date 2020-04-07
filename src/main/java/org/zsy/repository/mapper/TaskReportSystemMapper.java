package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportSystem;
import org.zsy.repository.model.TaskReportSystemExample;

public interface TaskReportSystemMapper {
    long countByExample(TaskReportSystemExample example);

    int deleteByExample(TaskReportSystemExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("appId") String appId, @Param("code") String code);

    int insert(TaskReportSystem record);

    int insertSelective(TaskReportSystem record);

    List<TaskReportSystem> selectByExample(TaskReportSystemExample example);

    TaskReportSystem selectByPrimaryKey(@Param("id") String id, @Param("appId") String appId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") TaskReportSystem record, @Param("example") TaskReportSystemExample example);

    int updateByExample(@Param("record") TaskReportSystem record, @Param("example") TaskReportSystemExample example);

    int updateByPrimaryKeySelective(TaskReportSystem record);

    int updateByPrimaryKey(TaskReportSystem record);
}