package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppInfo;
import org.zsy.repository.model.AppInfoExample;

public interface AppInfoMapper {
    long countByExample(AppInfoExample example);

    int deleteByExample(AppInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppInfo record);

    int insertSelective(AppInfo record);

    List<AppInfo> selectByExample(AppInfoExample example);

    AppInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppInfo record, @Param("example") AppInfoExample example);

    int updateByExample(@Param("record") AppInfo record, @Param("example") AppInfoExample example);

    int updateByPrimaryKeySelective(AppInfo record);

    int updateByPrimaryKey(AppInfo record);
}