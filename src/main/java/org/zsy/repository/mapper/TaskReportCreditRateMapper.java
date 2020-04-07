package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportCreditRate;
import org.zsy.repository.model.TaskReportCreditRateExample;

public interface TaskReportCreditRateMapper {
    long countByExample(TaskReportCreditRateExample example);

    int deleteByExample(TaskReportCreditRateExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int insert(TaskReportCreditRate record);

    int insertSelective(TaskReportCreditRate record);

    List<TaskReportCreditRate> selectByExample(TaskReportCreditRateExample example);

    TaskReportCreditRate selectByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") TaskReportCreditRate record, @Param("example") TaskReportCreditRateExample example);

    int updateByExample(@Param("record") TaskReportCreditRate record, @Param("example") TaskReportCreditRateExample example);

    int updateByPrimaryKeySelective(TaskReportCreditRate record);

    int updateByPrimaryKey(TaskReportCreditRate record);
}