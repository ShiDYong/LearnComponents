package com.data.test.service.impl;

import com.data.test.entity.Dict;
import com.data.test.mapper.DictMapper;
import com.data.test.service.DictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {

}
