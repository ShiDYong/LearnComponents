package com.data.test.mbg.mapper;

import com.data.test.mbg.model.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询所有用户的信息
     * @return
     */
    List<SysUser> findAll();

}