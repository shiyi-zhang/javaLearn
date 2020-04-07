package org.zsy.repository.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppCatStatisticsDay;
import org.zsy.repository.model.AppCatStatisticsDayExample;

public interface AppCatStatisticsDayMapper {
    long countByExample(AppCatStatisticsDayExample example);

    int deleteByExample(AppCatStatisticsDayExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime);

    int insert(AppCatStatisticsDay record);

    int insertSelective(AppCatStatisticsDay record);

    List<AppCatStatisticsDay> selectByExample(AppCatStatisticsDayExample example);

    AppCatStatisticsDay selectByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime);

    int updateByExampleSelective(@Param("record") AppCatStatisticsDay record, @Param("example") AppCatStatisticsDayExample example);

    int updateByExample(@Param("record") AppCatStatisticsDay record, @Param("example") AppCatStatisticsDayExample example);

    int updateByPrimaryKeySelective(AppCatStatisticsDay record);

    int updateByPrimaryKey(AppCatStatisticsDay record);
}