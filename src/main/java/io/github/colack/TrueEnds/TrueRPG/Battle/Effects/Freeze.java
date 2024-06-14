package io.github.colack.TrueEnds.TrueRPG.Battle.Effects;

import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

public class Freeze extends Status {
    public Freeze() {
        super("Frozen", "Freeze", 3, 0, 0);
    }

    public String returnStatusText() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> "is frozen solid!";
            case 1 -> "is frozen stiff!";
            case 2 -> "is ice cold!";
            case 3 -> "is frozen!";
            case 4 -> "is frozen in place!";
            default -> "is completely frozen!";
        };
    }
}
