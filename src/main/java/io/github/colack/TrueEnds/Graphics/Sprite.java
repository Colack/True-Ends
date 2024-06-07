package io.github.colack.TrueEnds.Graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sprite {
    public String name, path;
    public int x, y, width, height;

    public Sprite(String name, String path, int x, int y, int width, int height) {
        this.name = name;
        this.path = path;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render(Graphics g) {
        // Start by loading the image

    }
}
