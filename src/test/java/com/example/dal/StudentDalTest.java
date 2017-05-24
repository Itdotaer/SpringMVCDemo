package com.example.dal;

import com.example.AutoConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jt_hu on 2017/5/22.
 */

interface A {
    void show();
}

class AI implements A{

    public void show() {
        System.out.println("show");
    }
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AutoConfig.class})
public class StudentDalTest {

    @Autowired
    private StudentDal studentDal;

    @Test
    public void test(){
        A a = new AI();
        a.show();
        Assert.assertNotNull(studentDal);
    }
}
