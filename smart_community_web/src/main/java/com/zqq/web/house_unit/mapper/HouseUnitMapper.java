package com.zqq.web.house_unit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zqq.web.house_unit.entity.HouseUnit;
import org.apache.ibatis.annotations.Param;

public interface HouseUnitMapper extends BaseMapper<HouseUnit> {
    //ๅๅๅ่กจ
    IPage<HouseUnit> getList(IPage<HouseUnit> page, @Param("buildName") String buildName, @Param("unitName") String unitName);
}
