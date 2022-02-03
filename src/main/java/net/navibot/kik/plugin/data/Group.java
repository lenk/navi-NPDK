package net.navibot.kik.plugin.data;

import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unused")
public abstract class Group {
    private final HashMap<String, Object> storage;
    private final List<Member> members;
    private final String picture;
    private final String name;

    private final boolean publicChat;

    public Group(HashMap<String, Object> storage, List<Member> members, String picture, String name, boolean publicChat) {
        this.storage = storage;
        this.members = members;
        this.picture = picture;
        this.name = name;
        this.publicChat = publicChat;
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

    public List<Member> getMembers() {
        return members;
    }

    public boolean isPublicChat() {
        return publicChat;
    }

    abstract void send(Response response);
}
