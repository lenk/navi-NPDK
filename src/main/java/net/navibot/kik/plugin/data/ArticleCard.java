package net.navibot.kik.plugin.data;

public class ArticleCard extends UriCard {
    private final byte[] preview;

    public ArticleCard(String title, String description, String url, String name, byte[] preview) {
        super(title, description, url, name);

        this.preview = preview;
    }

    public byte[] getPreview() {
        return preview;
    }
}
