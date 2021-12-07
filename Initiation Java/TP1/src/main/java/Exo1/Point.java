package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jessicadarosa
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    public int distance(Point p){
        //return (int) Math.sqrt(((this.getX() - p.getX())*(this.getX() - p.getX())) +
        //        ((this.getY() - p.getY())*(this.getY() - p.getY())) );
        return (int) Math.sqrt((Math.pow(this.getX() - p.getX(),2) + Math.pow(this.getY() -  p.getY(), 2)));
    }

    @Override
    public String toString() {
        return "{" + "x=" + x + ", y=" + y + '}';
    }   

    
}
