package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawBrandRate;
import org.zsy.repository.model.AppUserDrawBrandRateExample;

public interface AppUserDrawBrandRateMapper {
    long countByExample(AppUserDrawBrandRateExample example);

    int deleteByExample(AppUserDrawBrandRateExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawBrandRate record);

    int insertSelective(AppUserDrawBrandRate record);

    List<AppUserDrawBrandRate> selectByExample(AppUserDrawBrandRateExample example);

    AppUserDrawBrandRate selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawBrandRate record, @Param("example") AppUserDrawBrandRateExample example);

    int updateByExample(@Param("record") AppUserDrawBrandRate record, @Param("example") AppUserDrawBrandRateExample example);

    int updateByPrimaryKeySelective(AppUserDrawBrandRate record);

    int updateByPrimaryKey(AppUserDrawBrandRate record);
}