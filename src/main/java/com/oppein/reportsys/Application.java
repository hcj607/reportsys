package com.oppein.reportsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author chenjianqi
 * @date 2017/2/28
 * 功能描述：
 * spring-boot 启动类
 * 额外描述：
 * 1)、继承SpringBootServletInitializer,重写 configure 方法,可以使用外部tomcat容器 启动该web项目
 *
 */
//
//@SpringBootApplication
//public class Application extends SpringBootServletInitializer{
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }
//
//    public static void main(String[] args){
//        SpringApplication.run(Application.class , args);
//    }
//
//}
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class , args);
    }

}