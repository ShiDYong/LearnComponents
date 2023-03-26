package com.data.test.service.impl;

import com.data.test.entity.Dept;
import com.data.test.mapper.DeptMapper;
import com.data.test.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 机构管理 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
