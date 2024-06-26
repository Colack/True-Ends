package io.github.colack.TrueEnds.Game;

import io.github.colack.TrueEnds.Utils.Util;
import io.github.colack.TrueEnds.Utils.Window;
import io.github.colack.TrueEnds.Sprite.Sprite;

/**
 * The Game class is used to create a new game object and start the game.
 * @since 0.0.1
 */
public class Game {
    public final String version = "0.0.1";
    public final String author = "Colack";
    public final String title = "True Ends";
    public final String description = "Find yourself in a world of False Ideals.";
    public final String license = "Apache License 2.0";

    public Window window;
    public Party party;
    public boolean isDebug;

    public int date = 830; // The date in the game, for example, 830 is the 30th of August, which is when the game starts.

    public Game(boolean isDebug) {
        window = createWindow();
        party = createParty();
        this.isDebug = isDebug;
    }

    public void start() {
        if (isDebug) Util.log("Game initiated with debug mode on");
        else Util.log("Game initiated with debug mode off");

        window.create();
    }

    public Window createWindow() {
        return new Window("True Ends", 1280, 720, true, true, true);
    }

    public Party createParty() {
        return new Party();
    }

    public void display() {
        window.display();
    }
}
