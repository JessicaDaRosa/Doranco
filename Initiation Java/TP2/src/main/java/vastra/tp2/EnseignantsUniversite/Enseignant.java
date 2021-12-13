/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vastra.tp2.EnseignantsUniversite;

/**
 *
 * @author jessicadarosa
 */
public abstract class Enseignant {
    protected String name;
    protected String surname;
    protected int nbHours;
    private double charges;
    
    /**
     * Constructeur
     * @param name
     * @param surname 
     */
    public Enseignant(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    /**
     *Fonction qui va calculer le salaire brut de l'enseignant (avant les charges)
     * @return int 
     */
    public abstract int calculateBrutAnualSalary();
    
    /**
     * Fonction qui va calculler le salaire net de l'enseignant.On enleve de son salaire brut le pourcentage correspondant a ces charges.
     * @return double
     */
    public double calculateNetAnualSalary(){
        return this.calculateBrutAnualSalary() - (this.calculateBrutAnualSalary() * this.charges);
    }
    
    /**
     * 
     * @return String le prenom de l'enseignant
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name le prenom de l'enseignant
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return String le nom de l'enseignant
     */
    public String getSurname() {
        return surname;
    }
    
    /**
     * 
     * @param surname le nom de l'enseignant
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    /**
     * 
     * @return int le nombre d'heures travailles par l'enseignant
     */
    public int getNbHours() {
        return nbHours;
    }
    
    /**
     * 
     * @param nbHours le nombre d'heures que l'enseignant a travaille dns ça totaitee
     */
    public void setNbHours(int nbHours) {
        this.nbHours = nbHours;
    }
    
    /**
     * 
     * @return double un double qui represente le pourcentage du salaire qui correspond aux charge
     */
    public double getCharges() {
        return charges;
    }
    
    /**
     * 
     * @param charges 
     */
    public void setCharges(double charges) {
        this.charges = charges;
    }
    
    /**
     * 
     * @return String
     */

    @Override
    public String toString() {
        return "Enseignant{" + "Name=" + name + ", Surname=" + surname + ", Number of hours worked=" 
                + nbHours + ", charges=" + charges + "% of salary, Brut annual Salary="+ 
                this.calculateBrutAnualSalary()+", Net annual Salary="+ this.calculateNetAnualSalary() +'}';
    }   
    
}
