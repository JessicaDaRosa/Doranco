/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exo2;

/**
 *
 * @author jessicadarosa
 */
public class Vehicule {
    private String categorie;
    private String couleur;
    protected int nbRoues;
    
    /**
     * 
     * @param categorie
     * @param couleur 
     */
    public Vehicule(String categorie, String couleur) {
        this.categorie = categorie;
        this.couleur = couleur;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "categorie=" + categorie + ", couleur=" + couleur + ", nbRoues=" + nbRoues + '}';
    }
    
    
}
