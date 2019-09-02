package com.zhaohong.dao_interface;

import com.zhaohong.dao_bean.PopBaseInfo;

public interface PopBaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PopBaseInfo record);

    int insertSelective(PopBaseInfo record);

    PopBaseInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PopBaseInfo record);

    int updateByPrimaryKey(PopBaseInfo record);
}