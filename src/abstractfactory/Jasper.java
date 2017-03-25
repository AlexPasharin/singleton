/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import factories.VaateTehdas;
import java.util.List;
import vaatteet.Vaate;


/**
 *
 * @author Alex
 */
public class Jasper {
    
    private List<Vaate> vaatteetPaalla;
    
    public void pukeudu(VaateTehdas tehdas){
        this.vaatteetPaalla = tehdas.getVaatteet();
    }
    
    public void kerroMitaOnPaalla(){
        if(this.vaatteetPaalla == null){
            System.out.println("Olen alasti, onpa nolo");
        }else{
            System.out.println("Minulla on päällä:\n" + this.vaatteetPaalla);
        }
    }
}
