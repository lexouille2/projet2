/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.jacob.project.dessin;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class Segment extends FigureSimple {
    
    private Point debut;
    private Point fin;
    
    public Segment(Point debut,Point fin, Color couleur) {
        super(couleur);
        this.debut = debut;
        this.fin = fin;
    }

    public Point getDebut() {
        return debut;
    }

    public Point getFin() {
        return fin;
    }

    @Override
    public String toString() {
        return "Segment{" + "debut=" + this.debut + ", fin=" + this.fin + '}';
    }
    
    
    
    public double longueur() {
        Segment s2;
        return this.debut.distance(this.fin);
    }
}
