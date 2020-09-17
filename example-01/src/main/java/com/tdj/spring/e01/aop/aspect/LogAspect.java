package com.tdj.spring.e01.aop.aspect;

import java.lang.reflect.Method;

import com.tdj.spring.e01.aop.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 
 * @author tangdj
 *
 */
@Aspect // 切面
@Component
public class LogAspect {

  // 定义切点
  @Pointcut("@annotation(com.tdj.spring.e01.aop.Action)")
  public void annotationPointCut() {};

  @After(value = "annotationPointCut()")
  public void after(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    System.out.println("注解式拦截" + action.name());
  }

  /**
   * *后面必须跟一个空格
   * 
   * @param joinPoint
   */
  @Before(value = "execution(* com.tdj.spring.e01.aop.service.DemoMethodService.*(..))")
  public void before(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();
    System.out.println("方法规则拦截" + method.getName());
  }
}
