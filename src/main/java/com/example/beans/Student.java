package com.example.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by jt_hu on 2017/5/22.
 */
public @Data class Student {

    @Setter
    @Getter
    private int id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private int age;

    @Setter
    @Getter
    private boolean sex;

    @Setter
    @Getter
    private String school;

}
