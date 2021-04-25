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
public class NoeudSimple extends Noeud{
    
    private double abs;
    private double ord;
    
    public NoeudSimple(double abs, double ord, int id){
        
        super(id);
        this.abs = abs;
        this.ord =ord;
        
    }
    
    public double getAbs(){
        return this.abs;
    }
    
    public double getOrd(){
        return this.ord;
    }
    
}
