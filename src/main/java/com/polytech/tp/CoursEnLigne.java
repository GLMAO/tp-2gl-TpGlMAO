package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // Ajoute la fonctionnalité supplémentaire (le texte)
        return super.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // Exemple de modification de comportement (optionnel)
        return super.getDuree(); 
    }
}