package com.data.test;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import org.junit.Test;

/**
 * @date 2023/3/26 00:04
 * @Description 代码生成类
 */
public class CodeGenerator {
    private  String projectPath = System.getProperty("user.dir");
    // 数据源配置
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig.Builder("jdbc:mysql://139.9.100.22:3306/mason?serverTimezone=GMT%2B8", "root", "BMWad@1023")
            .dbQuery(new MySqlQuery()) //所使用的数据查询
            .schema("mason") //数据库名
            .typeConvert(new MySqlTypeConvert()) //数据库类型转换
            .keyWordsHandler(new MySqlKeyWordsHandler());//数据库关键词处理器


    @Test
    public void generatorCode() {
        FastAutoGenerator
                .create(DATA_SOURCE_CONFIG)
                //全局配置
                .globalConfig(builder -> {
                    builder.author("mason") // 设置作者
                            // .enableSwagger() // 开启 swagger 模式
                            .enableSwagger()//开启swagger模式
                            .disableOpenDir() // 执行完毕不打开文件夹
                            .fileOverride() // 覆盖已生成文件
                            .dateType(DateType.TIME_PACK)//时间策略
                            .commentDate("yyyy-MM-dd")//注释时间
                            .outputDir(projectPath + "/src/main/java"); // 指定输出目录
                })
                //包配置
                .packageConfig(builder -> {
                    builder.parent("com.data.test") // 设置父包名
                            .controller("controller") //生成controller层
                            .entity("entity") //生成实体层
                            .service("service") //生成服务层
                            .serviceImpl("service.impl") //生成实现层
                            .mapper("mapper")//生成mapper层
                            .xml("mapper.xml"); //设置xml层
                    // .moduleName("mybatisplus");
                })
                //策略配置
                .strategyConfig(builder -> {
                    builder.addInclude("sys_user","sys_role","sys_user_role",
                                    "sys_role_menu","sys_menu",
                                    "sys_user_role","sys_role_dept","sys_dept",
                                    "sys_config","sys_dict","sys_log","sys_login_log") // 设置需要生成的表名
                            .addTablePrefix("sys_")// 设置过滤表前缀
                            .serviceBuilder() //开启service策略配置
                            .formatServiceFileName("%sService") //取消Service前的I
                            .controllerBuilder() //开启controller策略配置
                            .enableRestStyle() //配置restful风格
                            .enableHyphenStyle() //url中驼峰转连字符
                            .entityBuilder() //开启实体类配置
                            .enableLombok() //开启lombok
                            .enableChainModel(); //开启lombok链式操作

                })
                //模板配置
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                //执行
                .execute();
    }
}
