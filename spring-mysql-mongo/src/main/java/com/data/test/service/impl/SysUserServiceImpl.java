package com.data.test.service.impl;

import com.data.test.mbg.mapper.SysUserMapper;
import com.data.test.mbg.model.SysUser;
import com.data.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2023/4/2 13:37
 * @Description 用户管理的实现类
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    @Override
    public List<SysUser> findAll() {
        return userMapper.findAll();
    }
}
