package com.lc.boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @Description:
 * 启动类
 * 1.定义当前类为配置类
 * 2.启用自动配置
 * 3.组件扫描
 * @auther: Sakura
 * @date: 2018/11/19 15:53
 */
@SpringBootApplication
public class BootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class, args);
    }
}
