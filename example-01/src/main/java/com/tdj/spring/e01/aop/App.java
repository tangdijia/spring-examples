package com.tdj.spring.e01.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tdj.spring.e01.aop.service.DemoAnnotationService;
import com.tdj.spring.e01.aop.service.DemoMethodService;

/**
 * 
 * @author tangdj
 *
 */
public class App {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);
    DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
    DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
    demoAnnotationService.add();
    demoMethodService.add();
    context.close();
  }
}
