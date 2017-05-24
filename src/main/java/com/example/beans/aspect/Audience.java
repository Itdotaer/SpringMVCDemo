package com.example.beans.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by jt_hu on 2017/5/24.
 */
@Component
@Aspect
public class Audience {

    @Pointcut("execution(* com.example.beans.aspect.Performance.perform(String)) && args(name)")
    public void performance(String name){}

    @Around("performance(name)")
    public void  watchPerformance(ProceedingJoinPoint jp, String name){
        try{
            System.out.println(name + ":手机静音");
            System.out.println(name + ":观众入座");
            jp.proceed();
            System.out.println(name + ":鼓掌");
        }catch (Throwable e){
            System.out.println(name + ":表演不好看，需要退订");
        }
    }

//    @Before("performance()")
//    public void silenceCellPhones(){
//        System.out.println("手机静音");
//    }
//
//    @Before("performance()")
//    public void takeSeats(){
//        System.out.println("观众入座");
//    }
//
//    @AfterReturning("performance()")
//    public void applause(){
//        System.out.println("鼓掌");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund(){
//        System.out.println("表演不好看，需要退订");
//    }

}
