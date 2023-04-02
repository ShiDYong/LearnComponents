package com.data.test.controller;

import com.data.test.mbg.model.SysUser;
import com.data.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yongshi
 * @date 2023/4/2 13:40
 * @Description TODO
 */

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = "/findAll")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }

}
