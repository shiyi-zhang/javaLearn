package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawCityLevel;
import org.zsy.repository.model.AppUserDrawCityLevelExample;

public interface AppUserDrawCityLevelMapper {
    long countByExample(AppUserDrawCityLevelExample example);

    int deleteByExample(AppUserDrawCityLevelExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawCityLevel record);

    int insertSelective(AppUserDrawCityLevel record);

    List<AppUserDrawCityLevel> selectByExample(AppUserDrawCityLevelExample example);

    AppUserDrawCityLevel selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawCityLevel record, @Param("example") AppUserDrawCityLevelExample example);

    int updateByExample(@Param("record") AppUserDrawCityLevel record, @Param("example") AppUserDrawCityLevelExample example);

    int updateByPrimaryKeySelective(AppUserDrawCityLevel record);

    int updateByPrimaryKey(AppUserDrawCityLevel record);
}