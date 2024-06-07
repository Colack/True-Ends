package io.github.colack.TrueEnds.Utils;

import java.util.ArrayList;
import java.util.List;

import io.github.colack.TrueEnds.Sprite.Sprite;

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
    public JFrame frame;

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
}