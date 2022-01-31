package net.navibot.kik.plugin;

@SuppressWarnings("unused")
public @interface Command {
    String getBodyRegex() default "";

    String getTrigger();

    boolean exactOnly() default true;
}
