package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportPlatform;
import org.zsy.repository.model.TaskReportPlatformExample;

public interface TaskReportPlatformMapper {
    long countByExample(TaskReportPlatformExample example);

    int deleteByExample(TaskReportPlatformExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("appId") String appId, @Param("code") String code);

    int insert(TaskReportPlatform record);

    int insertSelective(TaskReportPlatform record);

    List<TaskReportPlatform> selectByExample(TaskReportPlatformExample example);

    TaskReportPlatform selectByPrimaryKey(@Param("id") String id, @Param("appId") String appId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") TaskReportPlatform record, @Param("example") TaskReportPlatformExample example);

    int updateByExample(@Param("record") TaskReportPlatform record, @Param("example") TaskReportPlatformExample example);

    int updateByPrimaryKeySelective(TaskReportPlatform record);

    int updateByPrimaryKey(TaskReportPlatform record);
}