package com.tdj.spring.e01.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author tangdj
 *
 */
public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(Config.class);
    DemoPublisher publisher = context.getBean(DemoPublisher.class);
    publisher.publish("hello world");
    context.close();
  }

}
