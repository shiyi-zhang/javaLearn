package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawRegionRate;
import org.zsy.repository.model.AppUserDrawRegionRateExample;

public interface AppUserDrawRegionRateMapper {
    long countByExample(AppUserDrawRegionRateExample example);

    int deleteByExample(AppUserDrawRegionRateExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawRegionRate record);

    int insertSelective(AppUserDrawRegionRate record);

    List<AppUserDrawRegionRate> selectByExample(AppUserDrawRegionRateExample example);

    AppUserDrawRegionRate selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawRegionRate record, @Param("example") AppUserDrawRegionRateExample example);

    int updateByExample(@Param("record") AppUserDrawRegionRate record, @Param("example") AppUserDrawRegionRateExample example);

    int updateByPrimaryKeySelective(AppUserDrawRegionRate record);

    int updateByPrimaryKey(AppUserDrawRegionRate record);
}