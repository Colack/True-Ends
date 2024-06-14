package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Burn extends Status {
    public Burn() {
        super("Burn", "Burn", 3, 5, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is on fire!";
            case 1 -> "is burning!";
            case 2 -> "is scorched!";
            case 3 -> "is ablaze!";
            case 4 -> "is engulfed in flames!";
            default -> "is burning to a crisp!";
        };
    }
}
