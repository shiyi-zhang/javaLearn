package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawMediaTime;
import org.zsy.repository.model.AppUserDrawMediaTimeExample;

public interface AppUserDrawMediaTimeMapper {
    long countByExample(AppUserDrawMediaTimeExample example);

    int deleteByExample(AppUserDrawMediaTimeExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawMediaTime record);

    int insertSelective(AppUserDrawMediaTime record);

    List<AppUserDrawMediaTime> selectByExample(AppUserDrawMediaTimeExample example);

    AppUserDrawMediaTime selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawMediaTime record, @Param("example") AppUserDrawMediaTimeExample example);

    int updateByExample(@Param("record") AppUserDrawMediaTime record, @Param("example") AppUserDrawMediaTimeExample example);

    int updateByPrimaryKeySelective(AppUserDrawMediaTime record);

    int updateByPrimaryKey(AppUserDrawMediaTime record);
}