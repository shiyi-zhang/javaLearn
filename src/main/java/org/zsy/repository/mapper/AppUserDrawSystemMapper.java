package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawSystem;
import org.zsy.repository.model.AppUserDrawSystemExample;

public interface AppUserDrawSystemMapper {
    long countByExample(AppUserDrawSystemExample example);

    int deleteByExample(AppUserDrawSystemExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawSystem record);

    int insertSelective(AppUserDrawSystem record);

    List<AppUserDrawSystem> selectByExample(AppUserDrawSystemExample example);

    AppUserDrawSystem selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawSystem record, @Param("example") AppUserDrawSystemExample example);

    int updateByExample(@Param("record") AppUserDrawSystem record, @Param("example") AppUserDrawSystemExample example);

    int updateByPrimaryKeySelective(AppUserDrawSystem record);

    int updateByPrimaryKey(AppUserDrawSystem record);
}