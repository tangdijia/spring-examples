package com.tdj.spring.e01.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 
 * @author tangdj
 *
 */
@Component
public class DemoPublisher {
  @Autowired
  ApplicationContext applicationContext;

  public void publish(String msg) {
    applicationContext.publishEvent(new DemoEvent(new Object(), msg));
  }
}
