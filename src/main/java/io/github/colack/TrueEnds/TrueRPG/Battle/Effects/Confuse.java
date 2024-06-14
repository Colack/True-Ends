package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Confuse extends Status {
    public Confuse() {
        super("Confused", "Confuse", 3, 0, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is confused!";
            case 1 -> "is attacking itself!";
            case 2 -> "is confused and attacking itself!";
            case 3 -> "is attacking itself in confusion!";
            case 4 -> "is confused and attacking allies!";
            default -> "is completely confused!";
        };
    }
}
