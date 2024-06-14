package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Paralyze extends Status {
    public Paralyze() {
        super("Paralyzed", "Paralyze", 3, 0, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is paralyzed!";
            case 1 -> "is paralyzed and can't move!";
            case 2 -> "is paralyzed and can't do anything!";
            case 3 -> "is paralyzed and can't act!";
            case 4 -> "is paralyzed and can't attack!";
            default -> "is completely paralyzed!";
        };
    }
}
