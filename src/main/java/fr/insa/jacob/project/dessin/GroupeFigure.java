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
public class GroupeFigure extends Figure {
    
    private List<Figure> contient;
    
    public GroupeFigure(){
        this.contient = new ArrayList<Figure>();
    }
    
    public void add(Figure f) {
        if (f.getGroupe() != this) {
            if (f.getGroupe() != null) {
                throw new Error("figure déja dans un autre groupe");
            }
            this.contient.add(f);
            f.setGroupe(this);
        }
    }

    public static String indente(String toIndente, String prefix){
        return prefix + toIndente.replaceAll("\n", "\n" + prefix);
    }
    
     @Override
    public String toString() {
        String res = "Groupe {\n";
        for (int i = 0; i < this.contient.size(); i++) {
            res = res + indente(this.contient.get(i).toString(), "  ") + "\n";
        }
        return res + "}";
    }

    
    
    
}
