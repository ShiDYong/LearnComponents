package com.data.test.service.impl;

import com.data.test.entity.LoginLog;
import com.data.test.mapper.LoginLogMapper;
import com.data.test.service.LoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统登录日志 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

}
