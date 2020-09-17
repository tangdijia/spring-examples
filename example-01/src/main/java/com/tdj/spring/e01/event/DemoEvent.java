package com.tdj.spring.e01.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @author tangdj
 *
 */
// @Component
public class DemoEvent extends ApplicationEvent {

  /**
   * 
   */
  private static final long serialVersionUID = 2689736945694445464L;
  private String msg;

  // public DemoEvent(Object source) {
  // super(source);
  // }

  public DemoEvent(Object source, String msg) {
    super(source);
    this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }



}
