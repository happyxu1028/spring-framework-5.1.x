package com.lagou.edu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspect {


    @Around(value = "execution(* com.lagou.edu.aspect..*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        //获取所有参数
        Object[] args = jp.getArgs();
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        return jp.proceed();
    }
}
