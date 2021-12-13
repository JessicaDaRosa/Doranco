/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vastra.tp2.EnseignantsUniversite;

/**
 *
 * @author jessicadarosa
 */
public class Doctorant extends Enseignant {
    private final int valPerHour; // valeur des heures travaillées
    private final int nbMaxHours; // nombre d'heures maximales payées
    
    /**
     * 
     * @param name
     * @param surname 
     */
    public Doctorant(String name, String surname) {
        super(name, surname);
        this.valPerHour = 30;
        this.nbMaxHours = 96;
    }
    
    /**
     * Le Doctorant est payée un montant fixe pour chaque heure travaille mais il
     * a un nombre maximal d'heures qu'il peut travaille. 
     * @return int
     */
    @Override
    public int calculateBrutAnualSalary() {
        if(this.nbHours >= this.nbMaxHours){
            return this.nbMaxHours * this.valPerHour;
        }
        return this.nbHours * this.valPerHour;
    }
    
        @Override
    public String toString() {
        return "Doctorant{" + "Name=" + name + ", Surname=" + surname + ", Number of hours worked=" 
                + nbHours + ", charges=" + this.getCharges() + "% of salary, Brut annual Salary="+ 
                this.calculateBrutAnualSalary()+", Net annual Salary="+ this.calculateNetAnualSalary() +'}';
    }
    
    
}
