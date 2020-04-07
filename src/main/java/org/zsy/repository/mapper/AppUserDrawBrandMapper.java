package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawBrand;
import org.zsy.repository.model.AppUserDrawBrandExample;

public interface AppUserDrawBrandMapper {
    long countByExample(AppUserDrawBrandExample example);

    int deleteByExample(AppUserDrawBrandExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId);

    int insert(AppUserDrawBrand record);

    int insertSelective(AppUserDrawBrand record);

    List<AppUserDrawBrand> selectByExample(AppUserDrawBrandExample example);

    AppUserDrawBrand selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId);

    int updateByExampleSelective(@Param("record") AppUserDrawBrand record, @Param("example") AppUserDrawBrandExample example);

    int updateByExample(@Param("record") AppUserDrawBrand record, @Param("example") AppUserDrawBrandExample example);

    int updateByPrimaryKeySelective(AppUserDrawBrand record);

    int updateByPrimaryKey(AppUserDrawBrand record);
}