package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        // Menambahkan minimal 6 karakter dengan variasi role dan level
        manager.addCharacter(new Character("Arthas", CharacterType.WARRIOR, 6, 150, 30, 40));
        manager.addCharacter(new Character("Jaina", CharacterType.MAGE, 5, 110, 25, 120));
        manager.addCharacter(new Character("Thrall", CharacterType.WARRIOR, 1, 90, 15, 30)); // Level 1 (uji setEnabled)
        manager.addCharacter(new Character("Sylvanas", CharacterType.ARCHER, 5, 130, 35, 70));
        manager.addCharacter(new Character("Illidan", CharacterType.ASSASSIN, 6, 160, 45, 90));
        manager.addCharacter(new Character("Uther", CharacterType.WARRIOR, 1, 100, 18, 20)); // Level 1 kedua

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow(manager);
                window.setVisible(true);
            }
        });
    }
}