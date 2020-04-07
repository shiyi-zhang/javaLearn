package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawWorth;
import org.zsy.repository.model.AppUserDrawWorthExample;

public interface AppUserDrawWorthMapper {
    long countByExample(AppUserDrawWorthExample example);

    int deleteByExample(AppUserDrawWorthExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawWorth record);

    int insertSelective(AppUserDrawWorth record);

    List<AppUserDrawWorth> selectByExample(AppUserDrawWorthExample example);

    AppUserDrawWorth selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawWorth record, @Param("example") AppUserDrawWorthExample example);

    int updateByExample(@Param("record") AppUserDrawWorth record, @Param("example") AppUserDrawWorthExample example);

    int updateByPrimaryKeySelective(AppUserDrawWorth record);

    int updateByPrimaryKey(AppUserDrawWorth record);
}