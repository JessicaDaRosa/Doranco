/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exo2;

/**
 *
 * @author jessicadarosa
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicule audi = new Voiture("audi", "rouge");
        Vehicule tricicle = new Tricicle("Honda", "Jaune");
        System.out.println(audi.toString() + "\n" + tricicle.toString());
    }
    
}
