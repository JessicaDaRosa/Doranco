/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vastra.tp2.EnseignantsUniversite;

/**
 *
 * @author jessicadarosa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enseignant a = new Chercheur("Alice", "Dupont");
        a.setNbHours(200);
        Enseignant b = new Vacataire("Bob", "Dupont", "Bad Wolf Industries");
        Enseignant c = new Doctorant("Charlie", "Dupont");
        System.out.println(a.toString() +"\n");
        System.out.println(b.toString() +"\n");
        System.out.println(c.toString() +"\n");

 }
    
}
