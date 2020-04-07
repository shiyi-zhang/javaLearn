package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppInfoCompetitor;
import org.zsy.repository.model.AppInfoCompetitorExample;

public interface AppInfoCompetitorMapper {
    long countByExample(AppInfoCompetitorExample example);

    int deleteByExample(AppInfoCompetitorExample example);

    int deleteByPrimaryKey(@Param("appId") String appId, @Param("competitorId") String competitorId);

    int insert(AppInfoCompetitor record);

    int insertSelective(AppInfoCompetitor record);

    List<AppInfoCompetitor> selectByExample(AppInfoCompetitorExample example);

    AppInfoCompetitor selectByPrimaryKey(@Param("appId") String appId, @Param("competitorId") String competitorId);

    int updateByExampleSelective(@Param("record") AppInfoCompetitor record, @Param("example") AppInfoCompetitorExample example);

    int updateByExample(@Param("record") AppInfoCompetitor record, @Param("example") AppInfoCompetitorExample example);

    int updateByPrimaryKeySelective(AppInfoCompetitor record);

    int updateByPrimaryKey(AppInfoCompetitor record);
}