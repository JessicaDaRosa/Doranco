/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exo1;

/**
 *
 * @author jessicadarosa
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point a = new Point(4,6);
        Point b = new Point(3,4);
        System.out.println("A:"+a.toString() +"\nB:" +b.toString() );
        System.out.println("The distance between A and B is: " + a.distance(b));
    }
    
}
