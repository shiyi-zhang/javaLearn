package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawMediaSource;
import org.zsy.repository.model.AppUserDrawMediaSourceExample;

public interface AppUserDrawMediaSourceMapper {
    long countByExample(AppUserDrawMediaSourceExample example);

    int deleteByExample(AppUserDrawMediaSourceExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("sChannelId") String sChannelId, @Param("wChannelId") String wChannelId);

    int insert(AppUserDrawMediaSource record);

    int insertSelective(AppUserDrawMediaSource record);

    List<AppUserDrawMediaSource> selectByExample(AppUserDrawMediaSourceExample example);

    AppUserDrawMediaSource selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("sChannelId") String sChannelId, @Param("wChannelId") String wChannelId);

    int updateByExampleSelective(@Param("record") AppUserDrawMediaSource record, @Param("example") AppUserDrawMediaSourceExample example);

    int updateByExample(@Param("record") AppUserDrawMediaSource record, @Param("example") AppUserDrawMediaSourceExample example);

    int updateByPrimaryKeySelective(AppUserDrawMediaSource record);

    int updateByPrimaryKey(AppUserDrawMediaSource record);
}