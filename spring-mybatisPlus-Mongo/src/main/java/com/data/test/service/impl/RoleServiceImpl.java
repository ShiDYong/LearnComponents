package com.data.test.service.impl;

import com.data.test.entity.Role;
import com.data.test.mapper.RoleMapper;
import com.data.test.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色管理 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
