package com.example.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by jt_hu on 2017/5/19.
 */
public class HelloWorldBean {

    private String msg1;
    private String msg2;
    private Student student;

    public HelloWorldBean(@Value("${systemProperties['msg1']}") String msg1, @Value("${msg2}") String msg2, Student student){
        this.msg1 = msg1;
        this.msg2 = msg2;
        this.student = student;
    }

    public String sayHello(){
        return msg1 + ":" + msg2;
    }

}
