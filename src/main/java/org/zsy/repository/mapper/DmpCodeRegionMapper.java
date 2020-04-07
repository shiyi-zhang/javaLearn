package org.zsy.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zsy.repository.model.DmpCodeRegion;
import org.zsy.repository.model.DmpCodeRegionExample;

public interface DmpCodeRegionMapper {
    long countByExample(DmpCodeRegionExample example);

    int deleteByExample(DmpCodeRegionExample example);

    int deleteByPrimaryKey(String id);

    int insert(DmpCodeRegion record);

    int insertSelective(DmpCodeRegion record);

    List<DmpCodeRegion> selectByExample(DmpCodeRegionExample example);

    DmpCodeRegion selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DmpCodeRegion record, @Param("example") DmpCodeRegionExample example);

    int updateByExample(@Param("record") DmpCodeRegion record, @Param("example") DmpCodeRegionExample example);

    int updateByPrimaryKeySelective(DmpCodeRegion record);

    int updateByPrimaryKey(DmpCodeRegion record);
}