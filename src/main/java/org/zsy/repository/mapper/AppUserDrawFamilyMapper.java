package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawFamily;
import org.zsy.repository.model.AppUserDrawFamilyExample;

public interface AppUserDrawFamilyMapper {
    long countByExample(AppUserDrawFamilyExample example);

    int deleteByExample(AppUserDrawFamilyExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawFamily record);

    int insertSelective(AppUserDrawFamily record);

    List<AppUserDrawFamily> selectByExample(AppUserDrawFamilyExample example);

    AppUserDrawFamily selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawFamily record, @Param("example") AppUserDrawFamilyExample example);

    int updateByExample(@Param("record") AppUserDrawFamily record, @Param("example") AppUserDrawFamilyExample example);

    int updateByPrimaryKeySelective(AppUserDrawFamily record);

    int updateByPrimaryKey(AppUserDrawFamily record);
}