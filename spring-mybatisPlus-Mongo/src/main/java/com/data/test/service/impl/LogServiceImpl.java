package com.data.test.service.impl;

import com.data.test.entity.Log;
import com.data.test.mapper.LogMapper;
import com.data.test.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统操作日志 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
