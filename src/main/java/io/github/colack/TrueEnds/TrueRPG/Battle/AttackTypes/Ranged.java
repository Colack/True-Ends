package io.github.colack.TrueEnds.TrueRPG.Battle.AttackTypes;

import io.github.colack.TrueEnds.TrueRPG.Battle.Attack;

public class Ranged extends Attack {
    public Ranged(String name, int damage, int critChance, int hitChance, String description, boolean hitsAll, String type) {
        super(name, damage, critChance, hitChance, description, hitsAll, type);
    }

    public Ranged() {
        super();
    }

    public String returnAttackText() {
        return "attacked with a ranged strike!";
    }
}
