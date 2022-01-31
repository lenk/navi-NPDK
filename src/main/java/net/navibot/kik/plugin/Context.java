package net.navibot.kik.plugin;

import org.apache.http.client.HttpClient;

import java.util.HashMap;

@SuppressWarnings("unused")
public class Context {
    private final HashMap<String, Object> storage;
    private final HttpClient client;

    public Context(HashMap<String, Object> storage, HttpClient client) {
        this.storage = storage;
        this.client = client;
    }

    public HashMap<String, Object> getStorage() {
        return storage;
    }

    public HttpClient getClient() {
        return client;
    }
}
