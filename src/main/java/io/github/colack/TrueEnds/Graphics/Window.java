package io.github.colack.TrueEnds.Graphics;

/*
    Import Statements

    Please verify that all of these imports are necessary for the code to compile.
    If they are not, please remove the unnecessary imports.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Window class for True Ends.
 * @since 0.0.13
 */
public class Window {
    private JFrame window;
    private JPanel panel;
    private String title;
    private int width, height;
    private boolean resizable, visible;
    private Thread gameThread;

    // List of sprites
    private List<Sprite> sprites = new ArrayList<>();

    /*
     This is not for the actual resolution of the window, but for the resolution of the game.

     No matter what the window size is, the game will always be rendering a upscale or downscaled version of 1080p.
    */
    final int WIDTH = 1920;
    final int HEIGHT = 1080;

    public Window(String title, int width, int height, boolean resizable, boolean visible) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.resizable = resizable;
    }

    public Window() {
        this("Window", 1280, 720, true, true);
    }

    public void create() {
        window = new JFrame(title);
        window.setSize(width, height);
        window.setResizable(resizable);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(visible);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.BLACK);
        panel.setDoubleBuffered(true);

        window.add(panel);
    }

    public void startGameThread() {
        gameThread = new Thread(this::run);
        gameThread.start();
    }

    public void run() {
        while (gameThread != null) {
            update();
            render();
        }
    }

    public void stopGameThread() {
        gameThread = null;
    }

    public void render() {
        Graphics g = panel.getGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.WHITE);
        g.fillRect(100, 100, 100, 100);

        g.dispose();

    }

    public void update() {

    }
}