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
public class Terrain {
    
    private double xmin;
    private double xmax;
    private double ymin;
    private double ymax;
    private Groupe terrain; //ensemble de tirangle terrain
    
    public Terrain(double xmin, double xmax, double ymin, double ymax, Groupe terrain){
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymax = ymax;
        this.ymin = ymin;
        this.terrain = terrain;
    }

    public double getXmin() {
        return xmin;
    }

    public double getXmax() {
        return xmax;
    }

    public double getYmin() {
        return ymin;
    }

    public double getYmax() {
        return ymax;
    }

    public Groupe getTerrain() {
        return terrain;
    }
    
}
