package net.navibot.kik.plugin.data;

@SuppressWarnings("unused")
public class Card {
    private final String title;

    public Card() {
        this("Navi Plugin ♡");
    }

    public Card(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
