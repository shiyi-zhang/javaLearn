package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawInterest;
import org.zsy.repository.model.AppUserDrawInterestExample;

public interface AppUserDrawInterestMapper {
    long countByExample(AppUserDrawInterestExample example);

    int deleteByExample(AppUserDrawInterestExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawInterest record);

    int insertSelective(AppUserDrawInterest record);

    List<AppUserDrawInterest> selectByExample(AppUserDrawInterestExample example);

    AppUserDrawInterest selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawInterest record, @Param("example") AppUserDrawInterestExample example);

    int updateByExample(@Param("record") AppUserDrawInterest record, @Param("example") AppUserDrawInterestExample example);

    int updateByPrimaryKeySelective(AppUserDrawInterest record);

    int updateByPrimaryKey(AppUserDrawInterest record);
}