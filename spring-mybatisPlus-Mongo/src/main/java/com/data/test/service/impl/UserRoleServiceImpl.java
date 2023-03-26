package com.data.test.service.impl;

import com.data.test.entity.UserRole;
import com.data.test.mapper.UserRoleMapper;
import com.data.test.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
