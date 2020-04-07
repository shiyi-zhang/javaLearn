package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawCreditRate;
import org.zsy.repository.model.AppUserDrawCreditRateExample;

public interface AppUserDrawCreditRateMapper {
    long countByExample(AppUserDrawCreditRateExample example);

    int deleteByExample(AppUserDrawCreditRateExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawCreditRate record);

    int insertSelective(AppUserDrawCreditRate record);

    List<AppUserDrawCreditRate> selectByExample(AppUserDrawCreditRateExample example);

    AppUserDrawCreditRate selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawCreditRate record, @Param("example") AppUserDrawCreditRateExample example);

    int updateByExample(@Param("record") AppUserDrawCreditRate record, @Param("example") AppUserDrawCreditRateExample example);

    int updateByPrimaryKeySelective(AppUserDrawCreditRate record);

    int updateByPrimaryKey(AppUserDrawCreditRate record);
}