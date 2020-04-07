package org.zsy.repository.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportStatisticsMonth;
import org.zsy.repository.model.TaskReportStatisticsMonthExample;

public interface TaskReportStatisticsMonthMapper {
    long countByExample(TaskReportStatisticsMonthExample example);

    int deleteByExample(TaskReportStatisticsMonthExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("getTime") Date getTime, @Param("appId") String appId);

    int insert(TaskReportStatisticsMonth record);

    int insertSelective(TaskReportStatisticsMonth record);

    List<TaskReportStatisticsMonth> selectByExample(TaskReportStatisticsMonthExample example);

    TaskReportStatisticsMonth selectByPrimaryKey(@Param("id") Integer id, @Param("getTime") Date getTime, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportStatisticsMonth record, @Param("example") TaskReportStatisticsMonthExample example);

    int updateByExample(@Param("record") TaskReportStatisticsMonth record, @Param("example") TaskReportStatisticsMonthExample example);

    int updateByPrimaryKeySelective(TaskReportStatisticsMonth record);

    int updateByPrimaryKey(TaskReportStatisticsMonth record);
}