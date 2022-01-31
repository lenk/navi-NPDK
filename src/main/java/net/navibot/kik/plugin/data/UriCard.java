package net.navibot.kik.plugin.data;

@SuppressWarnings("unused")
public class UriCard extends Card {
    private final String title;
    private final String description;
    private final String url;

    public UriCard(String title, String description, String url, String name) {
        super(name);

        this.description = description;
        this.title = title;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
