/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class2;

/**
 *
 * @author jessicadarosa
 */
public class Animal {
    private String name;
    private String sound;
    private String race;

    public Animal(String name, String sound, String race) {
        this.name = name;
        this.sound = sound;
        this.race = race;
    }

    
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public String animalSound(){
        return name + " does: " + sound;
    }
    
    
}
