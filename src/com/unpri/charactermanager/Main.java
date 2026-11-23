
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("       CHARACTER MANAGER");
        System.out.println("==================================");

        // Membuat 3 karakter
        Character karakter1 = new Character(
            "C001",
            "Aragorn",
            CharacterType.WARRIOR,
            5
        );

        Character karakter2 = new Character(
            "C002",
            "Gandalf",
            CharacterType.MAGE,
            10
        );

        Character karakter3 = new Character(
            "C003",
            "Legolas",
            CharacterType.ARCHER,
            7
        );

        // Menampilkan 3 karakter
        System.out.println("\n=== DATA KARAKTER ===");

        System.out.println(karakter1);
        System.out.println(karakter2);
        System.out.println(karakter3);

        // Demo naik level
        System.out.println("\n=== DEMO LEVEL UP ===");

        System.out.println("Sebelum naik level:");
        System.out.println("Nama: " + karakter1.getName());
        System.out.println("Level: " + karakter1.getLevel());
        System.out.println("HP: " + karakter1.getHitPoints());
        System.out.println("Attack: " + karakter1.getAttackPower());

        // Naik level dari 5 menjadi 6
        karakter1.setLevel(6);

        System.out.println("\nSetelah naik level:");
        System.out.println("Nama: " + karakter1.getName());
        System.out.println("Level: " + karakter1.getLevel());
        System.out.println("HP: " + karakter1.getHitPoints());
        System.out.println("Attack: " + karakter1.getAttackPower());

        // Demo fitur tambahan mana dan isAlive
        System.out.println("\n=== MINI CHALLENGE ===");

        Character karakter4 = new Character(
            "C004",
            "Necro",
            CharacterType.MAGE,
            5
        );

        // Mengatur mana
        karakter4.setMana(150);

        // Menampilkan informasi
        System.out.println("Nama: " + karakter4.getName());
        System.out.println("Mana: " + karakter4.getMana());

        // Memanggil isAlive()
        System.out.println(
            "Apakah karakter masih hidup? "
            + karakter4.isAlive()
        );

        System.out.println("\nData karakter tambahan:");
        System.out.println(karakter4);

        System.out.println("\n==================================");
        System.out.println("       PROGRAM SELESAI");
        System.out.println("==================================");
    }
}
