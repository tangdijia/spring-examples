package com.tdj.spring.e01.ioc.bean;

/**
 * 
 * @author tangdj
 *
 */
// @Component
// @Controller
public class Apple {

  private String color;

  public Apple() {
    color = "Red";
  }

  @Override
  public String toString() {
    return "Apple [color=" + color + "]";
  }

}
