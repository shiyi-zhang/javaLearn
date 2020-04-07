package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportRegionRate;
import org.zsy.repository.model.TaskReportRegionRateExample;

public interface TaskReportRegionRateMapper {
    long countByExample(TaskReportRegionRateExample example);

    int deleteByExample(TaskReportRegionRateExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId, @Param("type") String type);

    int insert(TaskReportRegionRate record);

    int insertSelective(TaskReportRegionRate record);

    List<TaskReportRegionRate> selectByExample(TaskReportRegionRateExample example);

    TaskReportRegionRate selectByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId, @Param("type") String type);

    int updateByExampleSelective(@Param("record") TaskReportRegionRate record, @Param("example") TaskReportRegionRateExample example);

    int updateByExample(@Param("record") TaskReportRegionRate record, @Param("example") TaskReportRegionRateExample example);

    int updateByPrimaryKeySelective(TaskReportRegionRate record);

    int updateByPrimaryKey(TaskReportRegionRate record);
}