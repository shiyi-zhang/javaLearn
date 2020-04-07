package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.AppUserDrawConsume;
import org.zsy.repository.model.AppUserDrawConsumeExample;

public interface AppUserDrawConsumeMapper {
    long countByExample(AppUserDrawConsumeExample example);

    int deleteByExample(AppUserDrawConsumeExample example);

    int deleteByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int insert(AppUserDrawConsume record);

    int insertSelective(AppUserDrawConsume record);

    List<AppUserDrawConsume> selectByExample(AppUserDrawConsumeExample example);

    AppUserDrawConsume selectByPrimaryKey(@Param("drawId") String drawId, @Param("code") String code);

    int updateByExampleSelective(@Param("record") AppUserDrawConsume record, @Param("example") AppUserDrawConsumeExample example);

    int updateByExample(@Param("record") AppUserDrawConsume record, @Param("example") AppUserDrawConsumeExample example);

    int updateByPrimaryKeySelective(AppUserDrawConsume record);

    int updateByPrimaryKey(AppUserDrawConsume record);
}