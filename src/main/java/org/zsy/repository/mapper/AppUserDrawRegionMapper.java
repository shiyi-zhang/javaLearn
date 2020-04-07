package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawRegion;
import org.zsy.repository.model.AppUserDrawRegionExample;

public interface AppUserDrawRegionMapper {
    long countByExample(AppUserDrawRegionExample example);

    int deleteByExample(AppUserDrawRegionExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawRegion record);

    int insertSelective(AppUserDrawRegion record);

    List<AppUserDrawRegion> selectByExample(AppUserDrawRegionExample example);

    AppUserDrawRegion selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawRegion record, @Param("example") AppUserDrawRegionExample example);

    int updateByExample(@Param("record") AppUserDrawRegion record, @Param("example") AppUserDrawRegionExample example);

    int updateByPrimaryKeySelective(AppUserDrawRegion record);

    int updateByPrimaryKey(AppUserDrawRegion record);
}