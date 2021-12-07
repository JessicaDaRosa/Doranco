/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo2;

/**
 *
 * @author jessicadarosa
 */
public class Tricicle extends Vehicule {
    
    /**
     * 
     * @param categorie
     * @param couleur 
     */
    public Tricicle(String categorie, String couleur) {
        super(categorie, couleur);
        this.nbRoues = 3;
    }

    @Override
    public String toString() {
        return "Tricicle{ Categorie: " + this.getCategorie() + "| Couleur: " + this.getCouleur() + 
                "| Nombre de Roues: "+ this.getNbRoues() +'}';
    }
    
}
