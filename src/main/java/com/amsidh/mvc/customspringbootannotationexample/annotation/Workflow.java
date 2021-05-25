package com.amsidh.mvc.customspringbootannotationexample.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Workflow {
    @AliasFor(
            annotation = Component.class,
            attribute = "value"

    )
    public String name() default "";

    public String instructions() default "";

    public boolean editable() default false;

    public String[] rooms() default {};


}
