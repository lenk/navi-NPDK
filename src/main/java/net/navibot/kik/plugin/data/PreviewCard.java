package net.navibot.kik.plugin.data;

@SuppressWarnings("unused")
public class PreviewCard extends Card {
    private final byte[] preview;
    private final String uri;

    public PreviewCard(String title, byte[] preview, String uri) {
        super(title);

        this.preview = preview;
        this.uri = uri;
    }

    public PreviewCard(byte[] preview, String uri) {
        this.preview = preview;
        this.uri = uri;
    }

    public PreviewCard(byte[] preview) {
        this(preview, null);
    }

    public byte[] getPreview() {
        return preview;
    }

    public String getUri() {
        return uri;
    }
}
