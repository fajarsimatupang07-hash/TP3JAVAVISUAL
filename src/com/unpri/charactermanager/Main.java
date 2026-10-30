package com.unpri.charactermanager;


import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        // Menambahkan minimal 5 karakter baru (Bagian B no. 1)
        manager.addCharacter(new Character("Arthas", CharacterType.WARRIOR, 3, 140, 25, 40));
        manager.addCharacter(new Character("Jaina", CharacterType.MAGE, 4, 110, 30, 120));
        manager.addCharacter(new Character("Thrall", CharacterType.WARRIOR, 2, 120, 22, 50));
        manager.addCharacter(new Character("Sylvanas", CharacterType.ARCHER, 5, 130, 35, 70));
        manager.addCharacter(new Character("Illidan", CharacterType.ASSASSIN, 6, 160, 45, 90));

        // Menjalankan GUI menggunakan SwingUtilities.invokeLater (Bagian A no. 4)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow(manager);
                window.setVisible(true);
            }
        });
    }
}