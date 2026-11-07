
package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int defense;
    private int mana;

    // Constructor 2 parameter
    public Character(String name, CharacterType type) {
        this(name, type, 1, 100, 20, 10);
    }

    // Constructor 3 parameter
    public Character(String name, CharacterType type, int level) {
        this(name, type, level, 100, 20, 10);
    }

    // Constructor 5 parameter
    public Character(String name, CharacterType type,
                     int level, int hitPoints, int attackPower) {
        this(name, type, level, hitPoints, attackPower, 10);
    }

    // Constructor 6 parameter
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

    // Mengecek apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menampilkan informasi karakter
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
