/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zenatti.vinicius.cupommaker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vini
 */
public class Cupom {

    private ArrayList<String> lista;

    public Cupom() {
        lista = new ArrayList<String>();

    }
    
    public void addItem(String e){
        lista.add(e);
    }
    
    public String generateText(){
        String texto = "------------------------";
        for(String e: lista){
            texto += "\n" + e;
        }
        texto += "\n------------------------";
        return texto;
    }
    
    
    
}
