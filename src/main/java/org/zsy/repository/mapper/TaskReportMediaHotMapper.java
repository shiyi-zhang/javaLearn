package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportMediaHot;
import org.zsy.repository.model.TaskReportMediaHotExample;

public interface TaskReportMediaHotMapper {
    long countByExample(TaskReportMediaHotExample example);

    int deleteByExample(TaskReportMediaHotExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("hotAppId") String hotAppId, @Param("appId") String appId);

    int insert(TaskReportMediaHot record);

    int insertSelective(TaskReportMediaHot record);

    List<TaskReportMediaHot> selectByExample(TaskReportMediaHotExample example);

    TaskReportMediaHot selectByPrimaryKey(@Param("id") Integer id, @Param("hotAppId") String hotAppId, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportMediaHot record, @Param("example") TaskReportMediaHotExample example);

    int updateByExample(@Param("record") TaskReportMediaHot record, @Param("example") TaskReportMediaHotExample example);

    int updateByPrimaryKeySelective(TaskReportMediaHot record);

    int updateByPrimaryKey(TaskReportMediaHot record);
}