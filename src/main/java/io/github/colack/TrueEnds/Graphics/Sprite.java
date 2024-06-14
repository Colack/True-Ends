package io.github.colack.TrueEnds.Graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite {
    public String name, path;
    public int x, y, width, height;

    public BufferedImage image;

    public Sprite(String name, String path, int x, int y, int width, int height) {
        this.name = name;
        this.path = path;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(getClass().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
