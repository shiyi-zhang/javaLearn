package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDraw;
import org.zsy.repository.model.AppUserDrawExample;

public interface AppUserDrawMapper {
    long countByExample(AppUserDrawExample example);

    int deleteByExample(AppUserDrawExample example);

    int deleteByPrimaryKey(String id);

    int insert(AppUserDraw record);

    int insertSelective(AppUserDraw record);

    List<AppUserDraw> selectByExample(AppUserDrawExample example);

    AppUserDraw selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppUserDraw record, @Param("example") AppUserDrawExample example);

    int updateByExample(@Param("record") AppUserDraw record, @Param("example") AppUserDrawExample example);

    int updateByPrimaryKeySelective(AppUserDraw record);

    int updateByPrimaryKey(AppUserDraw record);
}