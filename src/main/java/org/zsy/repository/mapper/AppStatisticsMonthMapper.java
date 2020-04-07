package org.zsy.repository.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppStatisticsMonth;
import org.zsy.repository.model.AppStatisticsMonthExample;

public interface AppStatisticsMonthMapper {
    long countByExample(AppStatisticsMonthExample example);

    int deleteByExample(AppStatisticsMonthExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime);

    int insert(AppStatisticsMonth record);

    int insertSelective(AppStatisticsMonth record);

    List<AppStatisticsMonth> selectByExample(AppStatisticsMonthExample example);

    AppStatisticsMonth selectByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime);

    int updateByExampleSelective(@Param("record") AppStatisticsMonth record, @Param("example") AppStatisticsMonthExample example);

    int updateByExample(@Param("record") AppStatisticsMonth record, @Param("example") AppStatisticsMonthExample example);

    int updateByPrimaryKeySelective(AppStatisticsMonth record);

    int updateByPrimaryKey(AppStatisticsMonth record);
}