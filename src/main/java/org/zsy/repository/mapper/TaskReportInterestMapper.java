package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportInterest;
import org.zsy.repository.model.TaskReportInterestExample;

public interface TaskReportInterestMapper {
    long countByExample(TaskReportInterestExample example);

    int deleteByExample(TaskReportInterestExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int insert(TaskReportInterest record);

    int insertSelective(TaskReportInterest record);

    List<TaskReportInterest> selectByExample(TaskReportInterestExample example);

    TaskReportInterest selectByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportInterest record, @Param("example") TaskReportInterestExample example);

    int updateByExample(@Param("record") TaskReportInterest record, @Param("example") TaskReportInterestExample example);

    int updateByPrimaryKeySelective(TaskReportInterest record);

    int updateByPrimaryKey(TaskReportInterest record);
}