package org.zsy.repository.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppCatStatisticsMonth;
import org.zsy.repository.model.AppCatStatisticsMonthExample;

public interface AppCatStatisticsMonthMapper {
    long countByExample(AppCatStatisticsMonthExample example);

    int deleteByExample(AppCatStatisticsMonthExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime, @Param("uv") Long uv);

    int insert(AppCatStatisticsMonth record);

    int insertSelective(AppCatStatisticsMonth record);

    List<AppCatStatisticsMonth> selectByExample(AppCatStatisticsMonthExample example);

    AppCatStatisticsMonth selectByPrimaryKey(@Param("id") String id, @Param("getTime") Date getTime, @Param("uv") Long uv);

    int updateByExampleSelective(@Param("record") AppCatStatisticsMonth record, @Param("example") AppCatStatisticsMonthExample example);

    int updateByExample(@Param("record") AppCatStatisticsMonth record, @Param("example") AppCatStatisticsMonthExample example);

    int updateByPrimaryKeySelective(AppCatStatisticsMonth record);

    int updateByPrimaryKey(AppCatStatisticsMonth record);
}