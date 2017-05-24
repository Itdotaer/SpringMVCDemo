package com.example.beans.multi;

import com.example.annotations.Cold;
import com.example.annotations.Creamy;
import org.springframework.stereotype.Component;

/**
 * Created by jt_hu on 2017/5/23.
 */
@Component
@Cold
@Creamy
public class IceCream implements Dessert {
}
