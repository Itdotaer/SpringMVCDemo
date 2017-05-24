package com.example.beans.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by jt_hu on 2017/5/24.
 */
@Component
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.example.beans.aspect.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
