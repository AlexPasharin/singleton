/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaatteet;

/**
 *
 * @author Alex
 */
public class Vaate {
    
    private final String nimi;
    private final String merkki;

    public Vaate(String nimi, String merkki) {
        this.nimi = nimi;
        this.merkki = merkki;
    }
    
    @Override
    public String toString(){
        return "(" + this.merkki + " " + this.nimi + ")";
    }
    
    
    
}
