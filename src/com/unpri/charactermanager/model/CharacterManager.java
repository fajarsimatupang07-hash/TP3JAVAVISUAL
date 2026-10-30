package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {
    private List<Character> characterList = new ArrayList<>();
    private static int totalCharacterCreated = 0; // Atribut static

    /**
     * Menambahkan karakter baru dengan validasi duplikasi nama.
     */
    public boolean addCharacter(Character c) {
        for (Character existing : characterList) {
            if (existing.equals(c)) {
                System.out.println("Gagal: Karakter dengan nama '" + c.getName() + "' sudah ada!");
                return false;
            }
        }
        characterList.add(c);
        totalCharacterCreated++;
        return true;
    }

    /**
     * Mencari karakter berdasarkan nama.
     */
    public Character findByName(String name) {
        for (Character c : characterList) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Menghapus karakter berdasarkan nama.
     */
    public boolean removeCharacter(String name) {
        Character c = findByName(name);
        if (c != null) {
            characterList.remove(c);
            return true;
        }
        return false;
    }

    public int getTotalCharacters() {
        return characterList.size();
    }

    /**
     * Mengembalikan salinan ArrayList (Defensive Copy) untuk menjaga Enkapsulasi.
     */
    public List<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }

    // --- MINI-CHALLENGE (Bagian B) ---

    /**
     * Menghitung rata-rata level seluruh karakter.
     * Mengembalikan 0 jika list kosong untuk menghindari ArithmeticException.
     */
    public double getAverageLevel() {
        if (characterList.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Character c : characterList) {
            sum += c.getLevel();
        }
        return (double) sum / characterList.size();
    }

    /**
     * Mengembalikan daftar karakter berdasarkan tipe tertentu.
     */
    public List<Character> findByType(CharacterType type) {
        List<Character> result = new ArrayList<>();
        for (Character c : characterList) {
            if (c.getType() == type) {
                result.add(c);
            }
        }
        return result;
    }

    // --- FITUR ANALITIK MANDIRI (Bagian C) ---

    /**
     * Mencari karakter terkuat berdasarkan jumlah Attack Power tertinggi.
     * @return Objek Character terkuat, atau null jika kosong.
     */
    public Character findStrongestCharacter() {
        if (characterList.isEmpty()) return null;
        Character strongest = characterList.get(0);
        for (Character c : characterList) {
            if (c.getAttackPower() > strongest.getAttackPower()) {
                strongest = c;
            }
        }
        return strongest;
    }

    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }
}