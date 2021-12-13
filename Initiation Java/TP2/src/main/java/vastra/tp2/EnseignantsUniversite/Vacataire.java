/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vastra.tp2.EnseignantsUniversite;

/**
 *
 * @author jessicadarosa
 */
public class Vacataire extends Enseignant {
    private final String org; // nom de l'organisation du vacataire
    private final int valPerHouer; // valeur paye pour chaque heure travaille
    
    /**
     * 
     * @param name
     * @param surname
     * @param org 
     */
    public Vacataire(String name, String surname, String org) {
        super(name, surname);
        this.org = org;
        this.valPerHouer = 40;
    }
    /**
     * Le vacataire est payee un valeur fixe pour chaque heure qu'il a travaille.
     * @return int
     */
    @Override
    public int calculateBrutAnualSalary() {
        return this.nbHours * this.valPerHouer;
    }
    
    @Override
    public String toString() {
        return "Vacataire{" + "Name=" + name + ", Surname=" + surname +"Organization="+ this.org +", Number of hours worked=" 
                + nbHours + ", charges=" + this.getCharges() + "% of salary, Brut annual Salary="+ 
                this.calculateBrutAnualSalary()+", Net annual Salary="+ this.calculateNetAnualSalary() +'}';
    }
}
