package com.example.beans.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by jt_hu on 2017/5/24.
 */
@Component
public class PerformanceImpl implements Performance {

    public void perform() {
        System.out.println("乐队开始表演");
    }

    public void perform(String name) {
        System.out.println("乐队开始表演:" + name);
    }

}
