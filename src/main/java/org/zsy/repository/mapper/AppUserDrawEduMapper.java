package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawEdu;
import org.zsy.repository.model.AppUserDrawEduExample;

public interface AppUserDrawEduMapper {
    long countByExample(AppUserDrawEduExample example);

    int deleteByExample(AppUserDrawEduExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawEdu record);

    int insertSelective(AppUserDrawEdu record);

    List<AppUserDrawEdu> selectByExample(AppUserDrawEduExample example);

    AppUserDrawEdu selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawEdu record, @Param("example") AppUserDrawEduExample example);

    int updateByExample(@Param("record") AppUserDrawEdu record, @Param("example") AppUserDrawEduExample example);

    int updateByPrimaryKeySelective(AppUserDrawEdu record);

    int updateByPrimaryKey(AppUserDrawEdu record);
}