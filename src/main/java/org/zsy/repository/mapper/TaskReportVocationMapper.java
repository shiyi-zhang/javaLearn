package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportVocation;
import org.zsy.repository.model.TaskReportVocationExample;

public interface TaskReportVocationMapper {
    long countByExample(TaskReportVocationExample example);

    int deleteByExample(TaskReportVocationExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int insert(TaskReportVocation record);

    int insertSelective(TaskReportVocation record);

    List<TaskReportVocation> selectByExample(TaskReportVocationExample example);

    TaskReportVocation selectByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") TaskReportVocation record, @Param("example") TaskReportVocationExample example);

    int updateByExample(@Param("record") TaskReportVocation record, @Param("example") TaskReportVocationExample example);

    int updateByPrimaryKeySelective(TaskReportVocation record);

    int updateByPrimaryKey(TaskReportVocation record);
}