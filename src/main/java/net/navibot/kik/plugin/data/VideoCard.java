package net.navibot.kik.plugin.data;

public class VideoCard extends PreviewCard {
    private final byte[] video;

    public VideoCard(String title, byte[] preview, byte[] video, String uri) {
        super(title, preview, uri);

        this.video = video;
    }

    public VideoCard(byte[] preview, byte[] video, String uri) {
        super(preview, uri);

        this.video = video;
    }

    public VideoCard(byte[] preview, byte[] video) {
        super(preview);

        this.video = video;
    }

    public byte[] getVideo() {
        return video;
    }
}
