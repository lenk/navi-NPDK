package net.navibot.kik.plugin.data;

@SuppressWarnings("unused")
public class IncomingMessage {
    private final Group group;
    private final Member from;
    private final String body;
    private final long cts;

    public IncomingMessage(Group group, Member from, String body, long cts) {
        this.group = group;
        this.from = from;
        this.body = body;
        this.cts = cts;
    }

    public Group getGroup() {
        return group;
    }

    public Member getFrom() {
        return from;
    }

    public String getBody() {
        return body;
    }

    public long getCts() {
        return cts;
    }
}
