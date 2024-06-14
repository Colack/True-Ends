package io.github.colack.TrueEnds.TrueRPG.Battle;

import java.util.List;
import java.util.ArrayList;

/**
 * This is a class that represents the status of any actor in a battle.
 * @since 0.0.13
 */
public class Status {
    public static String type = "None"; // The type of status effect.
    public static String name = "None"; // The name of the status effect.
    public static int duration = 0; // The duration of the status effect.
    public static int damage = 0; // The damage of the status effect.
    public static int heal = 0; // The healing of the status effect.

    public Status(String type, String name, int duration, int damage, int heal) {
        Status.type = type;
        Status.name = name;
        Status.duration = duration;
        Status.damage = damage;
        Status.heal = heal;
    }

    public Status() {
        Status.type = "None";
        Status.name = "None";
        Status.duration = 0;
        Status.damage = 0;
        Status.heal = 0;
    }

    public String returnStatusText() {
        return "";
    }

}

/*
    Quick note: Here is a list of all status effects in the game.
    - Poison:       Damage
    - Burn:         Damage
    - Freeze:       No action
    - Paralyze:     No action
    - Sleep:        No action
    - Confuse:      Chance to attack self
    - Brainwash:    Chance to attack allies
    - Suicidal:     Kills self after a certain amount of turns.
 */