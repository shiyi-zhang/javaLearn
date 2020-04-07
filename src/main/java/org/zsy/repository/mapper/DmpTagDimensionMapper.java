package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.DmpTagDimension;
import org.zsy.repository.model.DmpTagDimensionExample;

public interface DmpTagDimensionMapper {
    long countByExample(DmpTagDimensionExample example);

    int deleteByExample(DmpTagDimensionExample example);

    int deleteByPrimaryKey(String id);

    int insert(DmpTagDimension record);

    int insertSelective(DmpTagDimension record);

    List<DmpTagDimension> selectByExample(DmpTagDimensionExample example);

    DmpTagDimension selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DmpTagDimension record, @Param("example") DmpTagDimensionExample example);

    int updateByExample(@Param("record") DmpTagDimension record, @Param("example") DmpTagDimensionExample example);

    int updateByPrimaryKeySelective(DmpTagDimension record);

    int updateByPrimaryKey(DmpTagDimension record);
}