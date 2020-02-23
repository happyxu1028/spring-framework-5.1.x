//package com.lagou.edu.controller;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//@Aspect
//@Component
//public class ControllerAspect {
//
//    //request获取方法1
//    @Autowired
//    private HttpServletRequest request;
//
//    @Around(value = "execution(* com.example.demo.controller.HelloSpringBoot.*(..))")
//    public Object around(ProceedingJoinPoint jp) throws Throwable {
//        //获取所有参数
//        Object[] args = jp.getArgs();
//        for (int i=0;i<args.length;i++){
//            System.out.println(args[i]);
//        }
//
//        //request获取方法2
//        //HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        HttpSession session = request.getSession();
//        String token = (String)session.getAttribute("token");
//        //过滤非法请求
//        if (token==null||!token.equals("a")){
//            throw new RuntimeException("非法请求");
//        }
//        return jp.proceed();
//    }
//}
