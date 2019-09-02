package com.zhaohong.dao_interface;

import com.zhaohong.dao_bean.PopProofFileInfo;

public interface PopProofFileInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PopProofFileInfo record);

    int insertSelective(PopProofFileInfo record);

    PopProofFileInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PopProofFileInfo record);

    int updateByPrimaryKey(PopProofFileInfo record);
}