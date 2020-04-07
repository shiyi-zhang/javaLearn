package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportConsume;
import org.zsy.repository.model.TaskReportConsumeExample;

public interface TaskReportConsumeMapper {
    long countByExample(TaskReportConsumeExample example);

    int deleteByExample(TaskReportConsumeExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int insert(TaskReportConsume record);

    int insertSelective(TaskReportConsume record);

    List<TaskReportConsume> selectByExample(TaskReportConsumeExample example);

    TaskReportConsume selectByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") TaskReportConsume record, @Param("example") TaskReportConsumeExample example);

    int updateByExample(@Param("record") TaskReportConsume record, @Param("example") TaskReportConsumeExample example);

    int updateByPrimaryKeySelective(TaskReportConsume record);

    int updateByPrimaryKey(TaskReportConsume record);
}