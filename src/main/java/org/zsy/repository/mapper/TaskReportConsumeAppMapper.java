package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportConsumeApp;
import org.zsy.repository.model.TaskReportConsumeAppExample;

public interface TaskReportConsumeAppMapper {
    long countByExample(TaskReportConsumeAppExample example);

    int deleteByExample(TaskReportConsumeAppExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("consumeAppId") String consumeAppId, @Param("appId") String appId);

    int insert(TaskReportConsumeApp record);

    int insertSelective(TaskReportConsumeApp record);

    List<TaskReportConsumeApp> selectByExample(TaskReportConsumeAppExample example);

    TaskReportConsumeApp selectByPrimaryKey(@Param("id") Integer id, @Param("consumeAppId") String consumeAppId, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportConsumeApp record, @Param("example") TaskReportConsumeAppExample example);

    int updateByExample(@Param("record") TaskReportConsumeApp record, @Param("example") TaskReportConsumeAppExample example);

    int updateByPrimaryKeySelective(TaskReportConsumeApp record);

    int updateByPrimaryKey(TaskReportConsumeApp record);
}