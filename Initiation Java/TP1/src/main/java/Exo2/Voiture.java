/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo2;

/**
 *
 * @author jessicadarosa
 */
public class Voiture extends Vehicule {
    
    /**
     * 
     * @param categorie
     * @param couleur 
     */
    public Voiture(String categorie, String couleur) {
        super(categorie, couleur);
        this.nbRoues = 4;
    }

    @Override
    public String toString() {
        return "Voiture{ Categorie: " + this.getCategorie() + "| Couleur: " + this.getCouleur() + 
                "| Nombre de Roues: "+ this.getNbRoues() +'}';
    }
    
    
}
