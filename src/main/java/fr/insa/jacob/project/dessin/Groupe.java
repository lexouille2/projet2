/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.jacob.project.dessin;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class Groupe extends Terrain{
    
    private List<TriangleTerrain> contient;
    

    public Groupe(List<TriangleTerrain> contient, double xmin, double xmax, double ymin, double ymax, TriangleTerrain triangleTerrain) {
        super(xmin, xmax, ymin, ymax, triangleTerrain);
        this.contient = contient;
    }
    
    
    public List<TriangleTerrain> getContient() {
        return this.contient;
    }
}
