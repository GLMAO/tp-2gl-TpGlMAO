package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

// Doit implémenter Subject pour que le test passe
public class GestionnaireEmploiDuTemps implements Subject {
    
    private List<Observer> observers = new ArrayList<>();
    private List<ICours> listeCours = new ArrayList<>();
    private String dernierEtat;

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        setChangement("Nouveau cours ajouté : " + cours.getDescription());
    }

    // Méthode déclencheur
    public void setChangement(String message) {
        this.dernierEtat = message;
        notifyObservers(message);
    }

    // --- Implémentation du Pattern Observer ---

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}