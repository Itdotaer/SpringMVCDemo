package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by jt_hu on 2017/5/23.
 */
@Component
@PropertySource("classpath:app.propertites")
public class PropertitesConfig {

    @Autowired
    Environment env;

    public Environment getEnv(){
        return env;
    }
}
