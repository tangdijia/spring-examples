package com.tdj.spring.e01.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @author tangdj
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

  public void onApplicationEvent(DemoEvent event) {
    System.out.println(event.getSource());
    String msg = event.getMsg();
    System.out.println("receive:" + msg);

  }

}
