/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import java.util.List;
import vaatteet.Vaate;

/**
 *
 * @author Alex
 */
public abstract class VaateTehdas {
    
    private List<Vaate> vaatteet;
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(this.vaatteet.get(0).toString());
        
        for(int i = 1; i < this.vaatteet.size(); i++){
            sb.append(", ");
            sb.append(this.vaatteet.get(i).toString());
        }
        
        return sb.toString();
    }
   
    public void setVaatteet(List<Vaate> vaatteet){
        this.vaatteet = vaatteet;
    }
    
    public List<Vaate> getVaatteet(){
        return this.vaatteet;
    }
}
