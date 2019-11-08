package cn.pri.smilly.spring_aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class TestServiceProxy {

    @Pointcut("execution(public * cn.pri.smilly.spring_aop.TestService.*(..))")
    public void pointcut(){}

    @Before(value = "pointcut()")
    public void beforePointcut(){
        System.out.println("before pointcut execute");
    }

    @After(value = "pointcut()")
    public void afterPointcut(){
        System.out.println("after pointcut execute");
    }

}
