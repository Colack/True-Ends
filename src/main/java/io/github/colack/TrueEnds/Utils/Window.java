package io.github.colack.TrueEnds.Utils;

import io.github.colack.TrueEnds.Utils.Util;
import io.github.colack.TrueEnds.Utils.Sprite;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Window class for True Ends.
 * @since 0.0.1
 */
public class Window {
    public String title;
    public int width, height;
    public boolean resizable, visible, isDebug;

    private List<JFrame> frames = new ArrayList<JFrame>();
    private JFrame frame;
    private List<Sprite> sprites = new ArrayList<Sprite>();

    public Window(String title, int width, int height, boolean resizable, boolean visible, boolean isDebug) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.resizable = resizable;
        this.visible = visible;
        this.isDebug = isDebug;
    }

    public void create() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(resizable);
        frame.setVisible(visible);
        frames.add(frame);

        if (isDebug) {
            Util.TrueEndsError("Window created with title: " + title + ", width: " + width + ", height: " + height + ", resizable: " + resizable + ", visible: " + visible, false, true);
        }
    }

    public void display() {
        frame.setVisible(true);
    }

    public void hide() {
        frame.setVisible(false);
    }

    public void createSprite(String name, int width, int height, boolean isDebug, String[] sprites) {
        Sprite sprite = new Sprite(name, width, height, isDebug, sprites);
        addSprite(sprite);
    }

    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }

    public void drawSprite(String name) {
        for (Sprite sprite : sprites) {
            if (sprite.name == name) {
                drawCurrentSprite(sprite);
            }
        }
    }

    public void drawCurrentSprite(Sprite sprite) {
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (String spriteName : sprite.sprites) {
                    try {
                        BufferedImage image = ImageIO.read(new File(spriteName));
                        g.drawImage(image, 0, 0, sprite.width, sprite.height, null);
                    } catch (IOException e) {
                        Util.TrueEndsError("Error reading image file: " + spriteName, true, false);
                    }
                }
            }
        });
    }
}