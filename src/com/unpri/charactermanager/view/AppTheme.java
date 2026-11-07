
package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import com.unpri.charactermanager.model.CharacterType;

public final class AppTheme {

    // PALET WARNA
    public static final Color BG_MAIN =
            Color.decode("#12121f");

    public static final Color BG_STATUS =
            Color.decode("#1e1e2f");

    public static final Color TEXT_MAIN =
            Color.WHITE;

    public static final Color TEXT_MUTED =
            Color.decode("#b2bec3");

    public static final Color TEXT_LIGHT =
            Color.WHITE;

    public static final Color GOLD =
            Color.decode("#fdcb6e");

    // FONT
    public static final Font FONT_TITLE =
            new Font("SansSerif", Font.BOLD, 22);

    public static final Font FONT_BODY =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font FONT_MONO =
            new Font("Monospaced", Font.PLAIN, 13);

    // BORDER
    public static final Border CARD_BORDER =
            BorderFactory.createEmptyBorder(8, 12, 8, 12);

    private AppTheme() {
    }

    // WARNA BERDASARKAN ROLE
    public static Color colorFor(CharacterType type) {

        switch (type) {
            case WARRIOR:
                return Color.decode("#d63031");

            case MAGE:
                return Color.decode("#0984e3");

            case ARCHER:
                return Color.decode("#00b894");

            default:
                return Color.GRAY;
        }
    }

    // DESKRIPSI ROLE
    public static String describe(CharacterType type) {

        switch (type) {
            case WARRIOR:
                return "Warrior: jarak dekat, HP tinggi";

            case MAGE:
                return "Mage: serangan sihir, HP rendah";

            case ARCHER:
                return "Archer: jarak jauh, seimbang";

            default:
                return "Role belum terdaftar";
        }
    }
}
