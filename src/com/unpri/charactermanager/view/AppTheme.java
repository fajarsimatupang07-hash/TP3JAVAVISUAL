package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.CharacterType;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class AppTheme {
    // 3 Warna Utama
    public static final Color BG_DARK = new Color(30, 30, 30);
    public static final Color TEXT_LIGHT = new Color(240, 240, 240);
    public static final Color GOLD_COLOR = new Color(255, 215, 0);

    // 3 Font Utama (Logical Font yang aman)
    public static final Font FONT_TITLE = new Font("SansSerif", Font.BOLD, 16);
    public static final Font FONT_REGULAR = new Font("Monospaced", Font.PLAIN, 12);
    public static final Font FONT_GOLD_BOLD = new Font("Monospaced", Font.BOLD, 13);

    // 1 Border Utama
    public static final Border CARD_BORDER = BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(100, 100, 100), 1),
        BorderFactory.createEmptyBorder(5, 8, 5, 8)
    );

    // Method colorFor (Pemetaan Role ke Warna)
    public static Color colorFor(CharacterType type) {
        switch (type) {
            case WARRIOR: return new Color(180, 50, 50);   // Merah bata
            case MAGE:    return new Color(50, 100, 180);  // Biru
            case ARCHER:  return new Color(50, 150, 50);   // Hijau
            case ASSASSIN:return new Color(120, 50, 150);  // Ungu
            default:      return new Color(100, 100, 100); // Abu-abu
        }
    }
}