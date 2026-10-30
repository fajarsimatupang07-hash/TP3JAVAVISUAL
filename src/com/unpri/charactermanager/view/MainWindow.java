package com.unpri.charactermanager.view;


import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {
    public MainWindow(CharacterManager manager) {
        
        // Pengaturan Jendela (Bagian A no. 2)
        setTitle("Character Manager — Sprint #3 (GUI)");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel Judul Atas
        JLabel titleLabel = new JLabel("DAFTAR KARAKTER & STATISTIK", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(titleLabel, BorderLayout.NORTH);

        // Panel Tengah: Menampilkan Data Secara DINAMIS via Loop (Bagian A no. 3)
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        listPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        List<Character> characters = manager.getAllCharacters();
        for (Character c : characters) {
            JLabel charLabel = new JLabel("• " + c.toString());
            charLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
            listPanel.add(charLabel);
        }

        JScrollPane scrollPane = new JScrollPane(listPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Panel Bawah: Mini-Challenge Statistik Rata-rata Level (Bagian B no. 2)
        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        statsPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        
        double avgLevel = manager.getAverageLevel();
        JLabel statsLabel = new JLabel("Statistik Rata-rata Level Karakter: " + String.format("%.2f", avgLevel));
        statsLabel.setFont(new Font("Arial", Font.BOLD, 12));
        statsPanel.add(statsLabel);

        add(statsPanel, BorderLayout.SOUTH);
    }
}