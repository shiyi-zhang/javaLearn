package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawPlatform;
import org.zsy.repository.model.AppUserDrawPlatformExample;

public interface AppUserDrawPlatformMapper {
    long countByExample(AppUserDrawPlatformExample example);

    int deleteByExample(AppUserDrawPlatformExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawPlatform record);

    int insertSelective(AppUserDrawPlatform record);

    List<AppUserDrawPlatform> selectByExample(AppUserDrawPlatformExample example);

    AppUserDrawPlatform selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawPlatform record, @Param("example") AppUserDrawPlatformExample example);

    int updateByExample(@Param("record") AppUserDrawPlatform record, @Param("example") AppUserDrawPlatformExample example);

    int updateByPrimaryKeySelective(AppUserDrawPlatform record);

    int updateByPrimaryKey(AppUserDrawPlatform record);
}