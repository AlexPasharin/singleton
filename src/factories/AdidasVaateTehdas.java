/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import java.util.ArrayList;
import java.util.List;
import vaatteet.Vaate;


public class AdidasVaateTehdas extends VaateTehdas {
    
    private static final String MERKKI = "Adidas";
    private static AdidasVaateTehdas INSTANCE;
    
    private AdidasVaateTehdas() {
        List vaatteet = new ArrayList();
        String[] vaateTyypit = {"farmarit", "t-paita", "lippis", "kengät"};
        
        for(String vaateTyyppi : vaateTyypit){
            vaatteet.add(new Vaate(vaateTyyppi, MERKKI));
        }
        super.setVaatteet(vaatteet);
    }
    
    public static AdidasVaateTehdas getInstance(){
        
        if(INSTANCE == null) INSTANCE = new AdidasVaateTehdas();
        
        return INSTANCE;
    }
    
}
