package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawTaste;
import org.zsy.repository.model.AppUserDrawTasteExample;

public interface AppUserDrawTasteMapper {
    long countByExample(AppUserDrawTasteExample example);

    int deleteByExample(AppUserDrawTasteExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId);

    int insert(AppUserDrawTaste record);

    int insertSelective(AppUserDrawTaste record);

    List<AppUserDrawTaste> selectByExample(AppUserDrawTasteExample example);

    AppUserDrawTaste selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId);

    int updateByExampleSelective(@Param("record") AppUserDrawTaste record, @Param("example") AppUserDrawTasteExample example);

    int updateByExample(@Param("record") AppUserDrawTaste record, @Param("example") AppUserDrawTasteExample example);

    int updateByPrimaryKeySelective(AppUserDrawTaste record);

    int updateByPrimaryKey(AppUserDrawTaste record);
}