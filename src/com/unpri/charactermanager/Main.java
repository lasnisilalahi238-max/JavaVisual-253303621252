
package com.unpri.charactermanager;

import com.unpri.charactermanager.controller.CharacterController;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        manager.addCharacter(
            new Character("C001", "Aragorn", CharacterType.WARRIOR, 5)
        );

        manager.addCharacter(
            new Character("C002", "Gandalf", CharacterType.MAGE, 10)
        );

        manager.addCharacter(
            new Character("C003", "Legolas", CharacterType.ARCHER, 7)
        );

        manager.addCharacter(
            new Character("C004", "Arwen", CharacterType.HEALER, 4)
        );

        manager.addCharacter(
            new Character("C005", "Boromir", CharacterType.WARRIOR, 6)
        );

        manager.addCharacter(
            new Character("C006", "Gimli", CharacterType.WARRIOR, 9)
        );

        CharacterController controller =
            new CharacterController(manager);

        SwingUtilities.invokeLater(() -> {
            new MainWindow(controller);
        });
    }
}
