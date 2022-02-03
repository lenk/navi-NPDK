package net.navibot.kik.plugin;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@Documented
@SuppressWarnings("unused")
public @interface Command {
    String bodyRegex() default "";

    String menuTrigger() default "extras";

    String trigger();

    boolean exactOnly() default true;
}
