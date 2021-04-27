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
public abstract class FigureSimple extends Figure{ //pas d'instance qui appartient à figure simple
    
    private Color couleur;

    public FigureSimple(Color couleur) {
        this.couleur = couleur;
    }
    
    
}
