package com.data.test.service.impl;

import com.data.test.entity.Config;
import com.data.test.mapper.ConfigMapper;
import com.data.test.service.ConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统配置表 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements ConfigService {

}
