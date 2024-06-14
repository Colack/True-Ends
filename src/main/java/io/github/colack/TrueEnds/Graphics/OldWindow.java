package io.github.colack.TrueEnds.Graphics;

/*
    Import Statements

    Please verify that all of these imports are necessary for the code to compile.
    If they are not, please remove the unnecessary imports.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

/**
 * Window class for True Ends.
 * @since 0.0.13
 */
public class OldWindow {
    public JFrame window;
    public JPanel panel;
    public String title;
    public int width, height;
    public boolean resizable, visible;
    public Thread gameThread;

    // List of sprites
    private List<Sprite> sprites = new ArrayList<>();

    /*
     This is not for the actual resolution of the window, but for the resolution of the game.

     No matter what the window size is, the game will always be rendering a upscale or downscaled version of 1080p.
    */
    final int WIDTH = 1920;
    final int HEIGHT = 1080;

    public OldWindow(String title, int width, int height, boolean resizable, boolean visible) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.resizable = resizable;
    }

    public OldWindow() {
        this("Window", 1280, 720, true, true);
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
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(resizable);
        window.pack();
        window.setVisible(visible);
    }

    public void startGameThread() {
        gameThread = new Thread(this::run);
        gameThread.start();
    }

    public void run() {
        while (gameThread != null) {
            update();
            panel.repaint();
            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopGameThread() {
        gameThread = null;
    }

    public void render(Graphics g) {

    }

    public void update() {

    }
}