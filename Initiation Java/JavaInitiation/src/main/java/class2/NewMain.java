/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class2;

/**
 *
 * @author jessicadarosa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal chien1 = new Chien("Toto", "ouff", "Rotwiller");
        System.out.println(chien1.animalSound());
        
        Animal chat1 = new Chat("Pantoufle", "miaou", "british short leg");
        System.out.println(chat1.animalSound());
        
        Compte monCompte = new CompteCourrant(225.3);
        monCompte.voirSolde();
        monCompte.faireDepot(20.0);
        monCompte.voirSolde();
        monCompte.faireRetrait(30.0);
        monCompte.faireRetrait(300.0);
    }
    
}
