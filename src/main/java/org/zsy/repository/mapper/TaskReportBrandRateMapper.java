package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportBrandRate;
import org.zsy.repository.model.TaskReportBrandRateExample;

public interface TaskReportBrandRateMapper {
    long countByExample(TaskReportBrandRateExample example);

    int deleteByExample(TaskReportBrandRateExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int insert(TaskReportBrandRate record);

    int insertSelective(TaskReportBrandRate record);

    List<TaskReportBrandRate> selectByExample(TaskReportBrandRateExample example);

    TaskReportBrandRate selectByPrimaryKey(@Param("id") Integer id, @Param("code") String code, @Param("appId") String appId);

    int updateByExampleSelective(@Param("record") TaskReportBrandRate record, @Param("example") TaskReportBrandRateExample example);

    int updateByExample(@Param("record") TaskReportBrandRate record, @Param("example") TaskReportBrandRateExample example);

    int updateByPrimaryKeySelective(TaskReportBrandRate record);

    int updateByPrimaryKey(TaskReportBrandRate record);
}