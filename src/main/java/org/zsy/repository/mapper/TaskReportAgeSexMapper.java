package org.zsy.repository.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportAgeSex;
import org.zsy.repository.model.TaskReportAgeSexExample;

public interface TaskReportAgeSexMapper {
    long countByExample(TaskReportAgeSexExample example);

    int deleteByExample(TaskReportAgeSexExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("getTime") Date getTime);

    int insert(TaskReportAgeSex record);

    int insertSelective(TaskReportAgeSex record);

    List<TaskReportAgeSex> selectByExample(TaskReportAgeSexExample example);

    TaskReportAgeSex selectByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("getTime") Date getTime);

    int updateByExampleSelective(@Param("record") TaskReportAgeSex record, @Param("example") TaskReportAgeSexExample example);

    int updateByExample(@Param("record") TaskReportAgeSex record, @Param("example") TaskReportAgeSexExample example);

    int updateByPrimaryKeySelective(TaskReportAgeSex record);

    int updateByPrimaryKey(TaskReportAgeSex record);
}