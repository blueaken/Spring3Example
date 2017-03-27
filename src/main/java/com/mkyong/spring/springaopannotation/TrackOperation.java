package com.mkyong.spring.springaopannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by jianshen on 3/26/17.
 */
@Aspect
public class TrackOperation {
    //can be replaced by direct ref as below
//    @Pointcut("execution(* Operation.*(..))")
//    public void pointcutName(){}//pointcut name

    @Before("execution(* Operation.*(..))") //applying pointcut on before advice
    public void beforeAdvice()
    {
        System.out.println("additional concern");
    }

    @After("execution(* Operation.*(..))") //applying pointcut on after advice
    public void afterAdvice()
    {
        System.out.println("remaining concern");
    }
}
