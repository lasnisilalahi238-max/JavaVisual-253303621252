
package com.unpri.charactermanager.model;

import java.util.Locale;
import java.util.Objects;

public class Character {

    private String id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    private static int totalCharacterCreated = 0;

    // Constructor tanpa parameter
    public Character() {
        this("C000", "Unknown", CharacterType.WARRIOR, 1);
    }

    // Constructor dengan parameter
    public Character(String id, String name,
                     CharacterType type, int level) {

        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1"
            );
        }

        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;

        this.hitPoints = 100 + (level * 10);
        this.attackPower = 10 + (level * 5);
        this.mana = 0;

        totalCharacterCreated++;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {

        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1"
            );
        }

        this.level = level;
        this.hitPoints = 100 + (level * 10);
        this.attackPower = 10 + (level * 5);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {

        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif"
            );
        }

        this.mana = mana;
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }

    // Membandingkan karakter berdasarkan nama
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return normalizeName(name).equals(
            normalizeName(other.name)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(normalizeName(name));
    }

    private String normalizeName(String name) {

        if (name == null) {
            return "";
        }

        return name.trim().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return name + " - " + type +
               " - Level " + level;
    }
}
