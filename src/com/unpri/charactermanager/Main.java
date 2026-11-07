
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PENGUJIAN CHARACTER MANAGER SPRINT #2 ===");

        CharacterManager manager = new CharacterManager();

        // 1. Pengujian penambahan karakter
        System.out.println("\n--- PENGUJIAN ADD CHARACTER ---");

        Character c1 = new Character(
            "Arthas", CharacterType.WARRIOR, 5, 150, 50, 30
        );

        Character c2 = new Character(
            "Jaina", CharacterType.MAGE, 4, 90, 65, 15
        );

        Character c3 = new Character(
            "Arthas", CharacterType.WARRIOR, 1, 100, 20, 10
        );

        manager.addCharacter(c1);
        manager.addCharacter(c2);
        manager.addCharacter(c3);

        System.out.println(
            "Total Karakter: " + manager.getTotalCharacters()
        );

        // 2. Pengujian rata-rata level
        System.out.println("\n--- MINI CHALLENGE ---");

        System.out.println(
            "Rata-rata Level: " + manager.getAverageLevel()
        );

        // 3. Pengujian pencarian berdasarkan tipe
        ArrayList<Character> mages =
            manager.findByType(CharacterType.MAGE);

        System.out.println("Karakter bertipe MAGE:");

        for (Character mage : mages) {
            System.out.println(mage);
        }

        // 4. Pengujian karakter terkuat
        System.out.println("\n--- FITUR ANALITIK ---");

        Character strongest = manager.findStrongest();

        if (strongest != null) {
            System.out.println(
                "Karakter Terkuat: " + strongest.getName()
            );

            System.out.println(
                "Attack Power: " + strongest.getAttackPower()
            );
        }

        // 5. Pengujian enkapsulasi
        System.out.println("\n--- PENGUJIAN ENKAPSULASI ---");

        ArrayList<Character> externalList =
            manager.getAllCharacters();

        externalList.clear();

        System.out.println(
            "Total karakter setelah list luar dihapus: "
            + manager.getTotalCharacters()
        );

        System.out.println(
            "Jika jumlah tetap 2, enkapsulasi berhasil."
        );

        System.out.println("\n=== PENGUJIAN SELESAI ===");
    }
}
