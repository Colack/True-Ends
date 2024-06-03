package io.github.colack.TrueEnds.Utils;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

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
    }

    public void drawSprite(String name, int x, int y) {
        for (Sprite sprite : sprites) {
            if (sprite.name.equals(name)) {
                sprite.draw(frame.getGraphics(), x, y);
            }
        }
    }

    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }
}