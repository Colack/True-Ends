package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Sleep extends Status {
    public Sleep() {
        super("Sleeping", "Sleep", 3, 0, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is sleeping!";
            case 1 -> "is fast asleep!";
            case 2 -> "is sleeping soundly!";
            case 3 -> "is in a deep sleep!";
            case 4 -> "is sleeping like a baby!";
            default -> "is completely asleep!";
        };
    }
}
