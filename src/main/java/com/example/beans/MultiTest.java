package com.example.beans;

import com.example.annotations.Cold;
import com.example.annotations.Creamy;
import com.example.beans.multi.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jt_hu on 2017/5/23.
 */
@Component
public class MultiTest {

    private Dessert dessert;

    @Autowired
//    @Qualifier("iceCream")
    @Cold
    @Creamy
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }

    public Dessert getDessert(){
        return dessert;
    }

}
