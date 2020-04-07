package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawVocation;
import org.zsy.repository.model.AppUserDrawVocationExample;

public interface AppUserDrawVocationMapper {
    long countByExample(AppUserDrawVocationExample example);

    int deleteByExample(AppUserDrawVocationExample example);

    int deleteByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawVocation record);

    int insertSelective(AppUserDrawVocation record);

    List<AppUserDrawVocation> selectByExample(AppUserDrawVocationExample example);

    AppUserDrawVocation selectByPrimaryKey(@Param("id") String id, @Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawVocation record, @Param("example") AppUserDrawVocationExample example);

    int updateByExample(@Param("record") AppUserDrawVocation record, @Param("example") AppUserDrawVocationExample example);

    int updateByPrimaryKeySelective(AppUserDrawVocation record);

    int updateByPrimaryKey(AppUserDrawVocation record);
}