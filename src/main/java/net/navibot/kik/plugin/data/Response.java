package net.navibot.kik.plugin.data;

@SuppressWarnings("unused")
public class Response {
    private String text;
    private Card card;

    public Response(Card card, String text) {
        this.card = card;
        this.text = text;
    }

    public Response(String text) {
        this.text = text;
    }

    public Response(Card card) {
        this.card = card;
    }

    public String getText() {
        return text;
    }

    public Card getCard() {
        return card;
    }
}
