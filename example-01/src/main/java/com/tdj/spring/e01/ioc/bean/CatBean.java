package com.tdj.spring.e01.ioc.bean;

// @Component
public class CatBean extends TestObject {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sayHello() {
    System.out.println("aaaaaaaaaaa");
  }
}
