
package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    // Menambahkan karakter
    public boolean addCharacter(Character character) {

        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(character.getName())) {
                System.out.println(
                    "Nama " + character.getName() +
                    " sudah digunakan!"
                );
                return false;
            }
        }

        characters.add(character);

        System.out.println(
            character.getName() + " berhasil ditambahkan."
        );

        return true;
    }

    // Menghitung total karakter
    public int getTotalCharacters() {
        return characters.size();
    }

    // Menghitung rata-rata level
    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character c : characters) {
            total += c.getLevel();
        }

        return (double) total / characters.size();
    }

    // Mencari berdasarkan tipe
    public ArrayList<Character> findByType(CharacterType type) {

        ArrayList<Character> result = new ArrayList<>();

        for (Character c : characters) {
            if (c.getType() == type) {
                result.add(c);
            }
        }

        return result;
    }

    // Mencari karakter terkuat
    public Character findStrongest() {

        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character c : characters) {
            if (c.getAttackPower() > strongest.getAttackPower()) {
                strongest = c;
            }
        }

        return strongest;
    }

    // Mengembalikan salinan daftar karakter
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }
}
