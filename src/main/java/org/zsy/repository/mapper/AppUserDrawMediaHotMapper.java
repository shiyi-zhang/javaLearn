package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawMediaHot;
import org.zsy.repository.model.AppUserDrawMediaHotExample;

public interface AppUserDrawMediaHotMapper {
    long countByExample(AppUserDrawMediaHotExample example);

    int deleteByExample(AppUserDrawMediaHotExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("drawId") String drawId);

    int insert(AppUserDrawMediaHot record);

    int insertSelective(AppUserDrawMediaHot record);

    List<AppUserDrawMediaHot> selectByExample(AppUserDrawMediaHotExample example);

    AppUserDrawMediaHot selectByPrimaryKey(@Param("id") Integer id, @Param("appId") String appId, @Param("drawId") String drawId);

    int updateByExampleSelective(@Param("record") AppUserDrawMediaHot record, @Param("example") AppUserDrawMediaHotExample example);

    int updateByExample(@Param("record") AppUserDrawMediaHot record, @Param("example") AppUserDrawMediaHotExample example);

    int updateByPrimaryKeySelective(AppUserDrawMediaHot record);

    int updateByPrimaryKey(AppUserDrawMediaHot record);
}