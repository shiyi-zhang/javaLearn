package org.zsy.repository.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportStatisticsDay;
import org.zsy.repository.model.TaskReportStatisticsDayExample;

public interface TaskReportStatisticsDayMapper {
    long countByExample(TaskReportStatisticsDayExample example);

    int deleteByExample(TaskReportStatisticsDayExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("getTime") Date getTime, @Param("appId") String appId);

    int insert(TaskReportStatisticsDay record);

    int insertSelective(TaskReportStatisticsDay record);

    List<TaskReportStatisticsDay> selectByExample(TaskReportStatisticsDayExample example);

    TaskReportStatisticsDay selectByPrimaryKey(@Param("id") Integer id, @Param("getTime") Date getTime, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportStatisticsDay record, @Param("example") TaskReportStatisticsDayExample example);

    int updateByExample(@Param("record") TaskReportStatisticsDay record, @Param("example") TaskReportStatisticsDayExample example);

    int updateByPrimaryKeySelective(TaskReportStatisticsDay record);

    int updateByPrimaryKey(TaskReportStatisticsDay record);
}