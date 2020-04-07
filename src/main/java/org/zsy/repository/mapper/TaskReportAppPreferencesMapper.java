package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportAppPreferences;
import org.zsy.repository.model.TaskReportAppPreferencesExample;

public interface TaskReportAppPreferencesMapper {
    long countByExample(TaskReportAppPreferencesExample example);

    int deleteByExample(TaskReportAppPreferencesExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int insert(TaskReportAppPreferences record);

    int insertSelective(TaskReportAppPreferences record);

    List<TaskReportAppPreferences> selectByExample(TaskReportAppPreferencesExample example);

    TaskReportAppPreferences selectByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportAppPreferences record, @Param("example") TaskReportAppPreferencesExample example);

    int updateByExample(@Param("record") TaskReportAppPreferences record, @Param("example") TaskReportAppPreferencesExample example);

    int updateByPrimaryKeySelective(TaskReportAppPreferences record);

    int updateByPrimaryKey(TaskReportAppPreferences record);
}