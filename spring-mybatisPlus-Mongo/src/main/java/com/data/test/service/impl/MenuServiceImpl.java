package com.data.test.service.impl;

import com.data.test.entity.Menu;
import com.data.test.mapper.MenuMapper;
import com.data.test.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
