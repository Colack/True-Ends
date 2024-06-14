package io.github.colack.TrueEnds.Graphics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class Window {
    public JFrame window = new JFrame();
    public JPanel panel;

    public String title;
    public int width, height;
    public boolean resizable, visible, isDebug;

    final int INTERNAL_WIDTH = 1920;
    final int INTERNAL_HEIGHT = 1080;

    private List<Sprite> sprites = new ArrayList<>();

    public Window(String title, int width, int height, boolean resizable, boolean visible, boolean isDebug) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.resizable = resizable;
        this.visible = visible;
        this.isDebug = isDebug;
    }

    public void create() {
        window = new JFrame(title);
        panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                render(g);
            }
        };

        panel.setPreferredSize(new Dimension(width, height));
        window.add(panel);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(resizable);
        window.setVisible(visible);
    }

    public void render(Graphics g) {
        // Take the path from the Sprite class, and add it to the JPanel
        for (Sprite sprite : sprites) {
            try {
                sprite.image = sprite.loadImage(sprite.path);
                g.drawImage(sprite.image, sprite.x, sprite.y, sprite.width, sprite.height, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }

    public void DEBUG_PWD() {
        if (isDebug) {
            System.out.println(System.getProperty("user.dir"));
        }
    }
}
