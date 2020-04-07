package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskDetail;
import org.zsy.repository.model.TaskDetailExample;

public interface TaskDetailMapper {
    long countByExample(TaskDetailExample example);

    int deleteByExample(TaskDetailExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("dimensionId") String dimensionId);

    int insert(TaskDetail record);

    int insertSelective(TaskDetail record);

    List<TaskDetail> selectByExample(TaskDetailExample example);

    TaskDetail selectByPrimaryKey(@Param("id") Integer id, @Param("dimensionId") String dimensionId);

    int updateByExampleSelective(@Param("record") TaskDetail record, @Param("example") TaskDetailExample example);

    int updateByExample(@Param("record") TaskDetail record, @Param("example") TaskDetailExample example);

    int updateByPrimaryKeySelective(TaskDetail record);

    int updateByPrimaryKey(TaskDetail record);
}