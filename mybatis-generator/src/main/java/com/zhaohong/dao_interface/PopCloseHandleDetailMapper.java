package com.zhaohong.dao_interface;

import com.zhaohong.dao_bean.PopCloseHandleDetail;
import org.apache.ibatis.annotations.Param;

public interface PopCloseHandleDetailMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("baseId") Long baseId);

    int insert(PopCloseHandleDetail record);

    int insertSelective(PopCloseHandleDetail record);

    PopCloseHandleDetail selectByPrimaryKey(@Param("id") Long id, @Param("baseId") Long baseId);

    int updateByPrimaryKeySelective(PopCloseHandleDetail record);

    int updateByPrimaryKey(PopCloseHandleDetail record);
}