
package com.unpri.charactermanager.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.unpri.charactermanager.controller.CharacterController;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class MainWindow extends JFrame {

    private final CharacterController controller;
    private JPanel characterPanel;
    private JLabel statisticsLabel;

    public MainWindow(CharacterController controller) {

        this.controller = controller;

        setTitle("Character Manager - TP8");
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel(
            "CHARACTER MANAGER",
            SwingConstants.CENTER
        );

        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        characterPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        characterPanel.setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        JScrollPane scrollPane = new JScrollPane(characterPanel);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(2, 1, 5, 5));

        statisticsLabel = new JLabel("", SwingConstants.CENTER);
        statisticsLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JButton addButton = new JButton("Tambah Karakter Baru");

        addButton.addActionListener(e -> {
            Character newCharacter = new Character(
                "C007",
                "Eowyn",
                CharacterType.WARRIOR,
                8
            );

            if (controller.addCharacter(newCharacter)) {
                JOptionPane.showMessageDialog(
                    this,
                    "Eowyn berhasil ditambahkan!"
                );

                refreshCharacterList();
                addButton.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Karakter gagal ditambahkan."
                );
            }
        });

        bottomPanel.add(statisticsLabel);
        bottomPanel.add(addButton);

        add(bottomPanel, BorderLayout.SOUTH);

        refreshCharacterList();

        setVisible(true);
    }

    private void refreshCharacterList() {

        characterPanel.removeAll();

        for (Character character : controller.getAllCharacters()) {

            JLabel label = new JLabel(
                character.getName()
                + " | " + character.getType()
                + " | Level: " + character.getLevel()
                + " | HP: " + character.getHitPoints()
                + " | Attack: " + character.getAttackPower()
            );

            label.setFont(new Font("Arial", Font.PLAIN, 14));
            label.setBorder(
                BorderFactory.createEmptyBorder(8, 8, 8, 8)
            );

            characterPanel.add(label);
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
