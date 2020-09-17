package com.tdj.spring.eg01.ioc.config;

import com.tdj.spring.eg01.ioc.bean.TestObject;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 
 * @author tangdj
 *
 */
@Configuration
@ComponentScan(basePackages = "cn.com.tangdj.spring.ioc.bean", useDefaultFilters = false,
    includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
        value = TestObject.class)})
public class AssignableTypeConfig {

  // @Bean
  // public Apple apple() {
  // return new Apple();
  // }
}
