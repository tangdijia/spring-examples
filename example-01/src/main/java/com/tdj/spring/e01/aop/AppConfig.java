package com.tdj.spring.e01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * @author tangdj
 *
 */
@Configuration
@ComponentScan(basePackages = {"cn.com.tangdj.spring.aop"})
@EnableAspectJAutoProxy
public class AppConfig {

}
