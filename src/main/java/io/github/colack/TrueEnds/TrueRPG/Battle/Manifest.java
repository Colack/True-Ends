package io.github.colack.TrueEnds.TrueRPG.Battle;

import java.util.ArrayList;

import io.github.colack.TrueEnds.TrueRPG.Battle.Attack;
import io.github.colack.TrueEnds.TrueRPG.Battle.Status;

/**
 * This is a class that represents the Manifests of the actors in a battle. (Manifests are like Persona's and Stands)
 * @since 0.0.13
 */
public class Manifest {
    public String name, type, description;
    public int health, mana, attack, defense, magic, resistance, speed;
    public ArrayList<String> weaknesses, resistances, nullifications, absorptions;
    public ArrayList<Attack> attacks;
    public ArrayList<Status> statuses;

    public Manifest(String name, String type, String description, int health, int mana, int attack, int defense, int magic, int resistance, int speed, ArrayList<String> weaknesses, ArrayList<String> resistances, ArrayList<String> nullifications, ArrayList<String> absorptions, ArrayList<Attack> attacks, ArrayList<Status> statuses) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.health = health;
        this.mana = mana;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
        this.resistance = resistance;
        this.speed = speed;
        this.weaknesses = weaknesses;
        this.resistances = resistances;
        this.nullifications = nullifications;
        this.absorptions = absorptions;
        this.attacks = attacks;
        this.statuses = statuses;
    }

    public Manifest() {
        this.name = "None";
        this.type = "None";
        this.description = "None";
        this.health = 0;
        this.mana = 0;
        this.attack = 0;
        this.defense = 0;
        this.magic = 0;
        this.resistance = 0;
        this.speed = 0;
        this.weaknesses = new ArrayList<String>();
        this.resistances = new ArrayList<String>();
        this.nullifications = new ArrayList<String>();
        this.absorptions = new ArrayList<String>();
        this.attacks = new ArrayList<Attack>();
        this.statuses = new ArrayList<Status>();
    }
}
