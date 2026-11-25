
package com.unpri.charactermanager.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.unpri.charactermanager.controller.CharacterController;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class MainWindow extends JFrame {

    private static final int GOLD_LEVEL_THRESHOLD = 5;

    private final CharacterController controller;
    private JPanel characterPanel;
    private JLabel statisticsLabel;

    public MainWindow(CharacterController controller) {
        this.controller = controller;

        setTitle("Character Manager - TP10 v0.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Header
        JLabel titleLabel = new JLabel(
                "CHARACTER MANAGER",
                SwingConstants.CENTER
        );
        titleLabel.setFont(AppTheme.TITLE_FONT);
        titleLabel.setForeground(AppTheme.PRIMARY);
        titleLabel.setBorder(AppTheme.CARD_BORDER);

        add(titleLabel, BorderLayout.NORTH);

        // Daftar karakter
        characterPanel = new JPanel(new GridLayout(0, 1, 8, 8));
        characterPanel.setBackground(AppTheme.BACKGROUND);
        characterPanel.setBorder(AppTheme.CARD_BORDER);

        JScrollPane scrollPane = new JScrollPane(characterPanel);
        scrollPane.setPreferredSize(new Dimension(520, 350));

        add(scrollPane, BorderLayout.CENTER);

        // Legend role
        JPanel legendPanel = new JPanel();
        legendPanel.setLayout(
                new BoxLayout(legendPanel, BoxLayout.Y_AXIS)
        );
        legendPanel.setBackground(AppTheme.BACKGROUND);
        legendPanel.setBorder(AppTheme.CARD_BORDER);

        JLabel legendTitle = new JLabel("ROLE");
        legendTitle.setFont(AppTheme.BOLD_FONT);
        legendPanel.add(legendTitle);
        legendPanel.add(Box.createVerticalStrut(10));

        for (CharacterType type : CharacterType.values()) {
            JLabel roleLabel = new JLabel(type.toString());
            roleLabel.setFont(AppTheme.NORMAL_FONT);
            roleLabel.setForeground(AppTheme.colorFor(type));

            legendPanel.add(roleLabel);
            legendPanel.add(Box.createVerticalStrut(8));
        }

        add(legendPanel, BorderLayout.EAST);

        // Status
        JPanel statusPanel = new JPanel(new BorderLayout());
        statusPanel.setBackground(AppTheme.BACKGROUND);
        statusPanel.setBorder(AppTheme.CARD_BORDER);

        statisticsLabel = new JLabel("");
        statisticsLabel.setFont(AppTheme.NORMAL_FONT);

        JLabel versionLabel = new JLabel("v0.4");
        versionLabel.setFont(AppTheme.BOLD_FONT);

        statusPanel.add(statisticsLabel, BorderLayout.WEST);
        statusPanel.add(versionLabel, BorderLayout.EAST);

        add(statusPanel, BorderLayout.SOUTH);

        refreshCharacterList();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void refreshCharacterList() {
        characterPanel.removeAll();

        for (Character character : controller.getAllCharacters()) {
            JPanel card = new JPanel(new BorderLayout(10, 5));

            card.setBackground(AppTheme.colorFor(character.getType()));
            card.setOpaque(true);
            card.setBorder(AppTheme.borderFor(character.getType()));

            JLabel label = new JLabel(
                    character.getName()
                    + " | " + character.getType()
                    + " | Level: " + character.getLevel()
                    + " | HP: " + character.getHitPoints()
                    + " | Attack: " + character.getAttackPower()
            );

            label.setFont(AppTheme.NORMAL_FONT);
            label.setForeground(AppTheme.PRIMARY);

            // Level 5 ke atas berwarna emas dan tebal
            if (character.getLevel() >= GOLD_LEVEL_THRESHOLD) {
                label.setForeground(AppTheme.GOLD);
                label.setFont(AppTheme.BOLD_FONT);
            }

            // Properti tambahan 1: tooltip HP dan Attack
            label.setToolTipText(
                    "HP: " + character.getHitPoints()
                    + " | Attack: " + character.getAttackPower()
            );

            // Properti tambahan 2: karakter level 1 dinonaktifkan
            label.setEnabled(character.getLevel() != 1);

            card.add(label, BorderLayout.CENTER);
            characterPanel.add(card);
        }

        statisticsLabel.setText(
                "Total Karakter: " + controller.getTotalCharacters()
                + " | Rata-rata Level: "
                + String.format("%.2f", controller.getAverageLevel())
        );

        characterPanel.revalidate();
        characterPanel.repaint();
    }
}
