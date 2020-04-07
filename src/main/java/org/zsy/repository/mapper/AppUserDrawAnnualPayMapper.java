package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawAnnualPay;
import org.zsy.repository.model.AppUserDrawAnnualPayExample;

public interface AppUserDrawAnnualPayMapper {
    long countByExample(AppUserDrawAnnualPayExample example);

    int deleteByExample(AppUserDrawAnnualPayExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawAnnualPay record);

    int insertSelective(AppUserDrawAnnualPay record);

    List<AppUserDrawAnnualPay> selectByExample(AppUserDrawAnnualPayExample example);

    AppUserDrawAnnualPay selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawAnnualPay record, @Param("example") AppUserDrawAnnualPayExample example);

    int updateByExample(@Param("record") AppUserDrawAnnualPay record, @Param("example") AppUserDrawAnnualPayExample example);

    int updateByPrimaryKeySelective(AppUserDrawAnnualPay record);

    int updateByPrimaryKey(AppUserDrawAnnualPay record);
}