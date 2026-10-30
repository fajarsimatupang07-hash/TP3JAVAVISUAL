package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {
    private CharacterManager manager;
    public static final int HIGH_LEVEL_THRESHOLD = 5; // Konstanta batas level

    public MainWindow(CharacterManager manager) {
        this.manager = manager;
        
        setTitle("Character Manager — Sprint #4 (Theming)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(AppTheme.BG_DARK);

        // Panel Judul Atas
        JLabel titleLabel = new JLabel("DAFTAR KARAKTER & STATISTIK (THEMED)", JLabel.CENTER);
        titleLabel.setFont(AppTheme.FONT_TITLE);
        titleLabel.setForeground(AppTheme.GOLD_COLOR);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(titleLabel, BorderLayout.NORTH);

        // Panel Tengah: Kartu Karakter Dinamis dengan Loop
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        listPanel.setBackground(AppTheme.BG_DARK);
        listPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        List<Character> characters = manager.getAllCharacters();
        for (Character c : characters) {
            JPanel card = new JPanel(new FlowLayout(FlowLayout.LEFT));
            card.setOpaque(true); // setOpaque(true) agar warna background panel terlihat
            card.setBackground(AppTheme.colorFor(c.getType()));
            card.setBorder(AppTheme.CARD_BORDER);

            JLabel charLabel = new JLabel("• " + c.toString());
            
            // Mini-Challenge: Level >= 5 tampil dengan teks emas dan tebal
            if (c.getLevel() >= HIGH_LEVEL_THRESHOLD) {
                charLabel.setFont(AppTheme.FONT_GOLD_BOLD);
                charLabel.setForeground(AppTheme.GOLD_COLOR);
            } else {
                charLabel.setFont(AppTheme.FONT_REGULAR);
                charLabel.setForeground(AppTheme.TEXT_LIGHT);
            }

            // Properti Tambahan #1: Tooltip detail HP dan Attack Power
            card.setToolTipText("Detail -> HP: " + c.getHitPoints() + " | ATK: " + c.getAttackPower());
            
            // Properti Tambahan #2: setEnabled(false) jika level karakter == 1 (Non-aktif/Terkunci)
            if (c.getLevel() == 1) {
                card.setEnabled(false);
                charLabel.setEnabled(false);
            }

            card.add(charLabel);
            listPanel.add(card);
            listPanel.add(Box.createVerticalStrut(5)); // Jarak antar kartu
        }

        JScrollPane scrollPane = new JScrollPane(listPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Panel Bawah: Statistik Rata-rata Level
        JPanel statsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        statsPanel.setBackground(AppTheme.BG_DARK);
        statsPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        
        double avgLevel = manager.getAverageLevel();
        JLabel statsLabel = new JLabel("Statistik Rata-rata Level Karakter: " + String.format("%.2f", avgLevel));
        statsLabel.setFont(AppTheme.FONT_TITLE);
        statsLabel.setForeground(AppTheme.GOLD_COLOR);
        statsPanel.add(statsLabel);

        add(statsPanel, BorderLayout.SOUTH);

        // Menggunakan pack() sesuai ketentuan
        pack();
        setSize(Math.max(getWidth(), 550), Math.max(getHeight(), 400));
    }
}