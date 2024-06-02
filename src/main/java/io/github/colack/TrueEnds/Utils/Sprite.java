package io.github.colack.TrueEnds.Utils;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Sprite class for True Ends.
 * @since 0.0.1
 */
public class Sprite {
    public String name;
    public int width, height;
    public boolean isDebug;
    public String[] sprites;

    /*
        * @param name The name of the sprite.
        * @param width The width of the sprite.
        * @param height The height of the sprite.
        * @param isDebug Whether to print debug information.
        * @param sprites The sprites to use. Each sprite should be a separate file.
        * @return A new Sprite object.
     */
    public Sprite(String name, int width, int height, boolean isDebug, String[] sprites) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.isDebug = isDebug;
        this.sprites = sprites;
    }
}
