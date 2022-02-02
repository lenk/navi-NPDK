package net.navibot.kik.plugin;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@Documented
@SuppressWarnings("unused")
public @interface Command {
    String getBodyRegex() default "";

    String getTrigger();

    boolean exactOnly() default true;
}
