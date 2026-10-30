package com;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {
        // Membuat 3 karakter awal
        Character char1 = new Character("Arthas", CharacterType.WARRIOR, 1, 100, 20, 30);
        Character char2 = new Character("Jaina", CharacterType.MAGE, 1, 80, 25, 100);
        
        // Membuat 1 karakter baru untuk pengujian fitur mandiri/mana & isAlive (Bagian B no. 5)
        Character char3 = new Character("Sylvanas", CharacterType.ARCHER, 2, 90, 22, 60);

        System.out.println("=== DATA KARAKTER AWAL ===");
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);

        // Demo Level Up pada char1
        System.out.println("\n=== DEMO LEVEL UP (Arthas naik ke Level 3) ===");
        char1.setLevel(3);
        System.out.println(char1);

        // Demo pengecekan isAlive()
        System.out.println("\n=== DEMO STATUS HIDUP (isAlive) ===");
        System.out.println(char2.getName() + " masih hidup? " + char2.isAlive());
        
        // Simulasi karakter HP 0
        char2.setHitPoints(0);
        System.out.println(char2.getName() + " setelah HP 0, masih hidup? " + char2.isAlive());
    }
}