package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.TaskReportAnnualPay;
import org.zsy.repository.model.TaskReportAnnualPayExample;

public interface TaskReportAnnualPayMapper {
    long countByExample(TaskReportAnnualPayExample example);

    int deleteByExample(TaskReportAnnualPayExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int insert(TaskReportAnnualPay record);

    int insertSelective(TaskReportAnnualPay record);

    List<TaskReportAnnualPay> selectByExample(TaskReportAnnualPayExample example);

    TaskReportAnnualPay selectByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") TaskReportAnnualPay record, @Param("example") TaskReportAnnualPayExample example);

    int updateByExample(@Param("record") TaskReportAnnualPay record, @Param("example") TaskReportAnnualPayExample example);

    int updateByPrimaryKeySelective(TaskReportAnnualPay record);

    int updateByPrimaryKey(TaskReportAnnualPay record);
}