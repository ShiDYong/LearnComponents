package com.data.test.service;

import com.data.test.mbg.model.SysUser;

import java.util.List;

/**
 * @author yongshi
 * @date 2023/4/2 13:35
 * @Description TODO
 */


public interface SysUserService{

    /**
     * 查找所有的用户
     * @return
     */
    List<SysUser> findAll();


}
