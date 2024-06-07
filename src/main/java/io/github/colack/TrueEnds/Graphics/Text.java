package io.github.colack.TrueEnds.Graphics;

public class Text {
    private String content;
    private int x, y;
    private int size;

    public Text(String content, int x, int y, int size) {
        this.content = content;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }
}
