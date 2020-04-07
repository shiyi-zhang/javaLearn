package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskInfo;
import org.zsy.repository.model.TaskInfoExample;

public interface TaskInfoMapper {
    long countByExample(TaskInfoExample example);

    int deleteByExample(TaskInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskInfo record);

    int insertSelective(TaskInfo record);

    List<TaskInfo> selectByExample(TaskInfoExample example);

    TaskInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

    int updateByExample(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

    int updateByPrimaryKeySelective(TaskInfo record);

    int updateByPrimaryKey(TaskInfo record);
}