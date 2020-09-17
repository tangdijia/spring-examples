package com.tdj.spring.e01.ioc.config;

import com.tdj.spring.e01.ioc.bean.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.tdj.spring.e01.ioc.bean.Student;

/**
 * 
 * @author tangdj
 *
 *
 */
@Configuration
@ComponentScan(basePackages = "cn.com.tangdj.spring.ioc.bean", useDefaultFilters = false,
    includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class AppConfig {

  @Bean
  public Student createStudent() {
    Student obj = new Student();
    obj.setName("tom");
    return obj;
  }

  @Bean
  public Teacher teacher() {
    Teacher teacher = new Teacher();
    teacher.setName("Jack");
    return teacher;
  }
}
