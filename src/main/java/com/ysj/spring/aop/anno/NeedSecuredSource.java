package com.ysj.spring.aop.anno;

import java.lang.annotation.*;

/**
 * Created by cat on 2017-02-19.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@Inherited
public @interface NeedSecuredSource {
}
