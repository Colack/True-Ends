package io.github.colack.TrueEnds.Game;

import io.github.colack.TrueEnds.Utils.Util;
import io.github.colack.TrueEnds.Utils.Window;
import io.github.colack.TrueEnds.Game.Player;

// The party class is used to store 4 player objects.
public class Party {
    public Player player1, player2, player3, player4;

    public Party(Player player1, Player player2, Player player3, Player player4) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
    }

    public Party() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.player3 = new Player();
        this.player4 = new Player();
    }
}
