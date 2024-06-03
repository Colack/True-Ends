package io.github.colack.TrueEnds.Sprite;

import javax.swing.JFrame;

/**
 * This is the Sprite class. It is used to create sprites for the game.
 * @since 0.0.12
 */
public class Sprite {
    public String name, path;
    private int x, y, width, height;

    public Sprite(String name, String path, int x, int y, int width, int height) {
        this.name = name;
        this.path = path;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public static String loadSprite(String path) {
        return path;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int changeX(int x) {
        return this.x = x;
    }

    public int changeY(int y) {
        return this.y = y;
    }

    public int changeWidth(int width) {
        return this.width = width;
    }

    public int changeHeight(int height) {
        return this.height = height;
    }

    public String changeName(String name) {
        return this.name = name;
    }

    public String changePath(String path) {
        return this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public static void draw(JFrame frame, Sprite sprite) {
        // Draw the sprite

    }
}
