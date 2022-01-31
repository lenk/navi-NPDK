package net.navibot.kik.plugin.data;

import java.util.HashMap;

@SuppressWarnings("unused")
public class Member {
    private final HashMap<String, Object> storage;

    private final long lastActive;
    private final long lastTalked;
    private final String picture;
    private final boolean owner;
    private final boolean admin;
    private final String name;
    private final String id;

    public Member(HashMap<String, Object> storage, long lastActive, long lastTalked, String picture, String name, String id, boolean admin, boolean owner) {
        this.storage = storage;
        this.lastActive = lastActive;
        this.lastTalked = lastTalked;
        this.picture = picture;
        this.owner = owner;
        this.admin = admin;
        this.name = name;
        this.id = id;
    }

    public HashMap<String, Object> getStorage() {
        return storage;
    }

    public String getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public long getLastActive() {
        return lastActive;
    }

    public long getLastTalked() {
        return lastTalked;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isOwner() {
        return owner;
    }
}
