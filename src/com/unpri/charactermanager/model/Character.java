package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana; // Ekstensi Bagian B: Atribut mana baru

    // Constructor 1: Default
    public Character() {
        this.name = "Unknown";
        this.type = CharacterType.WARRIOR;
        this.level = 1;
        this.hitPoints = 100;
        this.attackPower = 15;
        this.mana = 50;
    }

    // Constructor 2: Parameterized
    public Character(String name, CharacterType type, int level, int hitPoints, int attackPower, int mana) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
        setMana(mana); // Menggunakan setter agar tervalidasi
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
        // Contoh desain: level naik menghitung ulang HP dan attack
        this.hitPoints = 100 + (level - 1) * 20;
        this.attackPower = 15 + (level - 1) * 5;
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

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Getter dan Setter Mana dengan validasi (Ekstensi B no. 2)
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh bernilai negatif!");
        }
        this.mana = mana;
    }

    // Method baru isAlive() (Ekstensi B no. 3)
    public boolean isAlive() {
        return this.hitPoints > 0;
    }

    // toString() diperbarui untuk menampilkan mana (Ekstensi B no. 4)
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", mana=" + mana +
                ", isAlive=" + isAlive() +
                '}';
    }
}