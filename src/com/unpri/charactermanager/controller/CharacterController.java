
package com.unpri.charactermanager.controller;

import java.util.List;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

public class CharacterController {

    private final CharacterManager manager;

    public CharacterController(CharacterManager manager) {
        this.manager = manager;
    }

    public List<Character> getAllCharacters() {
        return manager.getAllCharacters();
    }

    public int getTotalCharacters() {
        return manager.getTotalCharacters();
    }

    public double getAverageLevel() {
        return manager.getAverageLevel();
    }

    public boolean addCharacter(Character character) {
        return manager.addCharacter(character);
    }
}
