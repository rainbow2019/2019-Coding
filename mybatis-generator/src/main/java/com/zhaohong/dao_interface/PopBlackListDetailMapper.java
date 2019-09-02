package com.zhaohong.dao_interface;

import com.zhaohong.dao_bean.PopBlackListDetail;
import org.apache.ibatis.annotations.Param;

public interface PopBlackListDetailMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("baseId") Long baseId);

    int insert(PopBlackListDetail record);

    int insertSelective(PopBlackListDetail record);

    PopBlackListDetail selectByPrimaryKey(@Param("id") Long id, @Param("baseId") Long baseId);

    int updateByPrimaryKeySelective(PopBlackListDetail record);

    int updateByPrimaryKey(PopBlackListDetail record);
}