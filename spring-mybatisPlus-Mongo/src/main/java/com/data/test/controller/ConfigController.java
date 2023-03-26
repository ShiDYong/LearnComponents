package com.data.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统配置表 前端控制器
 * </p>
 *
 * @author mason
 * @since 2023-03-26
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @RequestMapping("/message")
    public String message(){
        return "Hello World!";
    }


}
