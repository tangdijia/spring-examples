package com.tdj.spring.eg01.ioc;

import com.tdj.spring.eg01.ioc.config.AssignableTypeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tdj.spring.eg01.ioc.bean.CatBean;

/**
 * 
 * @author tangdj
 *
 */
public class App {

  public static void main(String[] args) {
    // AnnotationConfigApplicationContext cxt =
    // new AnnotationConfigApplicationContext(AppConfig.class);
    // Student student = cxt.getBean(Student.class);
    // student.sayHello();
    //
    // Apple apple = cxt.getBean(Apple.class);
    // System.out.println(apple.toString());
    // cxt.close();

    AnnotationConfigApplicationContext cxt =
        new AnnotationConfigApplicationContext(AssignableTypeConfig.class);
    // Apple app = cxt.getBean(Apple.class);
    // System.out.println(app.toString());


    CatBean cat = cxt.getBean(CatBean.class);
    System.out.println(cat.toString());
    cxt.close();
  }
}
