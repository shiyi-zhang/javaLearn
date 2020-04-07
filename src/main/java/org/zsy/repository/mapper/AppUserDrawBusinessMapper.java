package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawBusiness;
import org.zsy.repository.model.AppUserDrawBusinessExample;

public interface AppUserDrawBusinessMapper {
    long countByExample(AppUserDrawBusinessExample example);

    int deleteByExample(AppUserDrawBusinessExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("dataTime") String dataTime, @Param("code") String code);

    int insert(AppUserDrawBusiness record);

    int insertSelective(AppUserDrawBusiness record);

    List<AppUserDrawBusiness> selectByExample(AppUserDrawBusinessExample example);

    AppUserDrawBusiness selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("dataTime") String dataTime, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawBusiness record, @Param("example") AppUserDrawBusinessExample example);

    int updateByExample(@Param("record") AppUserDrawBusiness record, @Param("example") AppUserDrawBusinessExample example);

    int updateByPrimaryKeySelective(AppUserDrawBusiness record);

    int updateByPrimaryKey(AppUserDrawBusiness record);
}