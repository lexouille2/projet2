/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.jacob.project.dessin;

/**
 *
 * @author PC
 */
public class Segment {
    
    private Point debut;
    private Point fin;
    
    public Segment(Point debut,Point fin) {
        this.debut = debut;
        this.fin = fin;
    }
    
    public double longueur() {
        Segment s2;
        return this.debut.distance(this.fin);
    }
}
