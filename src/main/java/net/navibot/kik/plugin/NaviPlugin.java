package net.navibot.kik.plugin;

import net.navibot.kik.plugin.data.IncomingMessage;
import net.navibot.kik.plugin.data.Response;
import org.pf4j.ExtensionPoint;

@SuppressWarnings("unused")
public interface NaviPlugin extends ExtensionPoint {

    Response onCalled(Context context, IncomingMessage incomingMessage);
}
