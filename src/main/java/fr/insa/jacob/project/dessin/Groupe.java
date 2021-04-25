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
public class Groupe extends TriangleTerrain{
    
    private List<TriangleTerrain> contient;
    
    public Groupe(int idTT, Point p1, Point p2, Point p3, ArrayList<TriangleTerrain> contient){
        super(idTT, p1, p2, p3);
        this.contient = contient;
    }
}
