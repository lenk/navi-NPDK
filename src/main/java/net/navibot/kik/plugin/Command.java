package net.navibot.kik.plugin;

@SuppressWarnings("unused")
public @interface Command {
    String getBodyRegex();

    String getTrigger();

    boolean exactOnly();
}
