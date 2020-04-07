package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawAppPreferences;
import org.zsy.repository.model.AppUserDrawAppPreferencesExample;

public interface AppUserDrawAppPreferencesMapper {
    long countByExample(AppUserDrawAppPreferencesExample example);

    int deleteByExample(AppUserDrawAppPreferencesExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawAppPreferences record);

    int insertSelective(AppUserDrawAppPreferences record);

    List<AppUserDrawAppPreferences> selectByExample(AppUserDrawAppPreferencesExample example);

    AppUserDrawAppPreferences selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawAppPreferences record, @Param("example") AppUserDrawAppPreferencesExample example);

    int updateByExample(@Param("record") AppUserDrawAppPreferences record, @Param("example") AppUserDrawAppPreferencesExample example);

    int updateByPrimaryKeySelective(AppUserDrawAppPreferences record);

    int updateByPrimaryKey(AppUserDrawAppPreferences record);
}