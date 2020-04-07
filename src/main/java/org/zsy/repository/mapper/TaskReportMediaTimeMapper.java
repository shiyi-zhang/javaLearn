package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportMediaTime;
import org.zsy.repository.model.TaskReportMediaTimeExample;

public interface TaskReportMediaTimeMapper {
    long countByExample(TaskReportMediaTimeExample example);

    int deleteByExample(TaskReportMediaTimeExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int insert(TaskReportMediaTime record);

    int insertSelective(TaskReportMediaTime record);

    List<TaskReportMediaTime> selectByExample(TaskReportMediaTimeExample example);

    TaskReportMediaTime selectByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportMediaTime record, @Param("example") TaskReportMediaTimeExample example);

    int updateByExample(@Param("record") TaskReportMediaTime record, @Param("example") TaskReportMediaTimeExample example);

    int updateByPrimaryKeySelective(TaskReportMediaTime record);

    int updateByPrimaryKey(TaskReportMediaTime record);
}