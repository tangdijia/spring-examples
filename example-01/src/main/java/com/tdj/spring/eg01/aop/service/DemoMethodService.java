package com.tdj.spring.eg01.aop.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author tangdj<br>
 *         使用方法被拦截的类
 */
@Service
public class DemoMethodService {

  public void add() {
    System.out.println("DemoMethodService add");
  }
}
