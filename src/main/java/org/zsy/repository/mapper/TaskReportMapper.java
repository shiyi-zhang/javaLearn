package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReport;
import org.zsy.repository.model.TaskReportExample;

public interface TaskReportMapper {
    long countByExample(TaskReportExample example);

    int deleteByExample(TaskReportExample example);

    int insert(TaskReport record);

    int insertSelective(TaskReport record);

    List<TaskReport> selectByExample(TaskReportExample example);

    int updateByExampleSelective(@Param("record") TaskReport record, @Param("example") TaskReportExample example);

    int updateByExample(@Param("record") TaskReport record, @Param("example") TaskReportExample example);
}