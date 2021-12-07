/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class2;

/**
 *
 * @author jessicadarosa
 */
public class CompteCourrant implements Compte {
    private double solde;

    public CompteCourrant(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
     
    @Override
    public void faireDepot(double montant) {
        System.out.println("On fait un depot de " + montant);
        this.solde += montant;
    }

    @Override
    public double faireRetrait(double montant) {
        if(this.solde>montant){
            this.solde -= montant;
            System.out.println("On a fait un retrai de " + montant);
            return montant;
        }
        else{
            System.out.println("Le montant est trop haut. \nImpossible de faire un retrait.");
            return 0.0;
        }
    }

    @Override
    public void voirSolde() {
        System.out.println("Le solde courrant est de: " + this.solde);
    }
    
}
