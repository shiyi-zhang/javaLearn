package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawType;
import org.zsy.repository.model.AppUserDrawTypeExample;

public interface AppUserDrawTypeMapper {
    long countByExample(AppUserDrawTypeExample example);

    int deleteByExample(AppUserDrawTypeExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawType record);

    int insertSelective(AppUserDrawType record);

    List<AppUserDrawType> selectByExample(AppUserDrawTypeExample example);

    AppUserDrawType selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawType record, @Param("example") AppUserDrawTypeExample example);

    int updateByExample(@Param("record") AppUserDrawType record, @Param("example") AppUserDrawTypeExample example);

    int updateByPrimaryKeySelective(AppUserDrawType record);

    int updateByPrimaryKey(AppUserDrawType record);
}