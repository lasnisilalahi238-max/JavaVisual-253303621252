
package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import com.unpri.charactermanager.model.CharacterType;

public class AppTheme {

    // =========================
    // WARNA APLIKASI
    // =========================

    public static final Color BACKGROUND =
            new Color(245, 245, 245);

    public static final Color PRIMARY =
            new Color(45, 55, 72);

    public static final Color GOLD =
            new Color(212, 175, 55);


    // =========================
    // FONT APLIKASI
    // =========================

    public static final Font TITLE_FONT =
            new Font(Font.SANS_SERIF, Font.BOLD, 22);

    public static final Font NORMAL_FONT =
            new Font(Font.SANS_SERIF, Font.PLAIN, 14);

    public static final Font BOLD_FONT =
            new Font(Font.SANS_SERIF, Font.BOLD, 14);


    // =========================
    // BORDER DEFAULT
    // =========================

    public static final Border CARD_BORDER =
            BorderFactory.createEmptyBorder(10, 10, 10, 10);


    // =========================
    // WARNA BERDASARKAN ROLE
    // =========================

    public static Color colorFor(CharacterType type) {

        switch (type) {

            case WARRIOR:
                return new Color(220, 80, 80);

            case MAGE:
                return new Color(100, 100, 220);

            case ARCHER:
                return new Color(70, 160, 90);

            case HEALER:
                return new Color(220, 180, 80);

            default:
                return BACKGROUND;
        }
    }


    // =========================
    // BORDER BERDASARKAN ROLE
    // =========================

    public static Border borderFor(CharacterType type) {

        return BorderFactory.createCompoundBorder(

                BorderFactory.createLineBorder(
                        colorFor(type),
                        2
                ),

                CARD_BORDER
        );
    }
}
