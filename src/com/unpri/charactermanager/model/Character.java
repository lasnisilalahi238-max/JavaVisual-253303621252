
package com.unpri.charactermanager.model;

public class Character {

    // Atribut private (Enkapsulasi)
    private String id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor tanpa parameter
    public Character() {
        this("C000", "Unknown", CharacterType.WARRIOR, 1);
    }

    // Constructor dengan parameter
    public Character(String id, String name,
                     CharacterType type, int level) {

        this.id = id;
        this.name = name;
        this.type = type;

        setLevel(level);

        // Mana awal
        this.mana = 0;
    }

    // Getter ID
    public String getId() {
        return id;
    }

    // Setter ID
    public void setId(String id) {
        this.id = id;
    }

    // Getter Nama
    public String getName() {
        return name;
    }

    // Setter Nama
    public void setName(String name) {
        this.name = name;
    }

    // Getter Type
    public CharacterType getType() {
        return type;
    }

    // Setter Type
    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter Level
    public int getLevel() {
        return level;
    }

    // Setter Level
    public void setLevel(int level) {

        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1"
            );
        }

        this.level = level;

        // Menghitung ulang HP
        this.hitPoints = 100 + (level * 10);

        // Menghitung ulang Attack Power
        this.attackPower = 10 + (level * 5);
    }

    // Getter HitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    // Setter HitPoints
    public void setHitPoints(int hitPoints) {

        if (hitPoints < 0) {
            throw new IllegalArgumentException(
                "HP tidak boleh negatif"
            );
        }

        this.hitPoints = hitPoints;
    }

    // Getter AttackPower
    public int getAttackPower() {
        return attackPower;
    }

    // Setter AttackPower
    public void setAttackPower(int attackPower) {

        if (attackPower < 0) {
            throw new IllegalArgumentException(
                "Attack Power tidak boleh negatif"
            );
        }

        this.attackPower = attackPower;
    }

    // Getter Mana
    public int getMana() {
        return mana;
    }

    // Setter Mana dengan validasi
    public void setMana(int mana) {

        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif"
            );
        }

        this.mana = mana;
    }

    // Memeriksa apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menampilkan informasi karakter
    @Override
    public String toString() {

        return "Character{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", mana=" + mana +
                ", isAlive=" + isAlive() +
                '}';
    }
}
