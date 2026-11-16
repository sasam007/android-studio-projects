package com.example.resto;

import androidx.annotation.NonNull;

/** A dish on the menu (starter, main course or dessert). Prices are stored in cents. */
public class MenuItem {
    final String nom;
    final String description;
    final int prixEnCentimes;

    MenuItem(String nom, String description, int prixEnCentimes) {
        this.nom = nom;
        this.description = description;
        this.prixEnCentimes = prixEnCentimes;
    }

    @NonNull
    @Override
    public String toString() {
        return nom;
    }
}
