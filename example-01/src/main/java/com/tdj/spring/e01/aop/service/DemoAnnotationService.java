package com.tdj.spring.e01.aop.service;

import com.tdj.spring.e01.aop.Action;
import org.springframework.stereotype.Service;

/**
 * 
 * @author tangdj<br>
 *         使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {

  @Action(name = "注解拦截式的add操作")
  public void add() {
    System.out.println("DemoAnnotationService add");
  }
}
