package com.example.beans.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by jt_hu on 2017/5/24.
 */
@Component
@EnableAspectJAutoProxy
public class AudienceProxyConfig {

    @Autowired
    private Audience audience;

}
