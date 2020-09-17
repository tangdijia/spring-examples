package com.tdj.spring.e01.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author tangdj
 *
 */

public class Student {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Autowired
  private Teacher teacher;

  public void sayHello() {
    System.out.println(name + " say: hello");
    System.out.println("his teacher is:" + teacher.getName());
  }

}
