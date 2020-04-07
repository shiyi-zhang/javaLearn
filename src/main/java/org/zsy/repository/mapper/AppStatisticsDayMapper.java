package org.zsy.repository.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppStatisticsDay;
import org.zsy.repository.model.AppStatisticsDayExample;

public interface AppStatisticsDayMapper {
    long countByExample(AppStatisticsDayExample example);

    int deleteByExample(AppStatisticsDayExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime);

    int insert(AppStatisticsDay record);

    int insertSelective(AppStatisticsDay record);

    List<AppStatisticsDay> selectByExample(AppStatisticsDayExample example);

    AppStatisticsDay selectByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime);

    int updateByExampleSelective(@Param("record") AppStatisticsDay record, @Param("example") AppStatisticsDayExample example);

    int updateByExample(@Param("record") AppStatisticsDay record, @Param("example") AppStatisticsDayExample example);

    int updateByPrimaryKeySelective(AppStatisticsDay record);

    int updateByPrimaryKey(AppStatisticsDay record);
}