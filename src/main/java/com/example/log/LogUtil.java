package com.example.log;

/**
 * Created by jt_hu on 2017/5/22.
 */
public class LogUtil {

    public static void before(){
        System.out.println("Before log");
    }

    public static void after(){
        System.out.println("After log");
    }

    public static void around(){
        System.out.println("Around log");
    }

    public static void throwing(){
        System.out.println("Throwing log");
    }

    public static void returning(){
        System.out.println("Returning log");
    }

}
