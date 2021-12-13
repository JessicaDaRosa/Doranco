/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vastra.tp2.EnseignantsUniversite;

/**
 *
 * @author jessicadarosa
 */
public class Chercheur extends Enseignant {
    private final int fixedSalary; // salaire fixe par mois
    private final int valSupHours; // valeur des heures complemetaires
    private final int nbMaxHours; // nombre maximal d'heures avante les heures complementaires
    
    /**
     * Constructeur
     * @param name
     * @param surname 
     */
    public Chercheur(String name, String surname) {
        super(name, surname);
        this.fixedSalary = 2000;
        this.valSupHours = 40;
        this.nbMaxHours = 192;
    }
    /**
     * Pour l'enseignant-chercheur son salaire brut et fixée par mois (donc 
     * salaire fixe * 12) et en plus on va lui ajoute un certain valeur par 
     * heure pour chaque heure suplementaire travaille en plus du nombre 
     * d'heures requises.
     * @return int salaire brut avant les charges
     */
    @Override
    public int calculateBrutAnualSalary() {
        if (this.nbHours > 0){
            return (this.fixedSalary * 12) + ((this.nbHours - this.nbMaxHours) 
                    * this.valSupHours);
        }
        return this.fixedSalary * 12;
    }
    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Enseignant-Chercheur{" + "Name=" + name + ", Surname=" + surname + ", Number of hours worked=" 
                + nbHours + ", charges=" + this.getCharges() + "% of salary, Brut annual Salary="+ 
                this.calculateBrutAnualSalary()+", Net annual Salary="+ this.calculateNetAnualSalary() +'}';
    }
    
    
    
    
    
}
