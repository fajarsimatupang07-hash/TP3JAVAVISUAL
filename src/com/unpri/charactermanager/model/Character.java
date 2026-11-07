
package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int defense;
    private int mana;

    // Constructor 1: Nama dan tipe
    public Character(String name, CharacterType type) {
        this(name, type, 1, 100, 20, 10);
    }

    // Constructor 2: Tanpa defense
    public Character(String name, CharacterType type,
                      int level, int hitPoints, int attackPower) {
        this(name, type, level, hitPoints, attackPower, 10);
    }

    // Constructor 3: Lengkap
    public Character(String name, CharacterType type,
                     int level, int hitPoints,
                     int attackPower, int defense) {

        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        this.defense = defense;
        this.mana = 0;
    }

    // Getter dan Setter
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
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    // Alias agar getAttack() juga bisa digunakan
    public int getAttack() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif!"
            );
        }

        this.mana = mana;
    }

    // Method pendukung
    public boolean isAlive() {
        return this.hitPoints > 0;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", defense=" + defense +
                ", mana=" + mana +
                '}';
    }
}
