/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import factories.AdidasVaateTehdas;
import factories.BossVaateTehdas;

/**
 *
 * @author Alex
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        Jasper jasper = new Jasper();
        
        System.out.println("Olen Jasper, olen syntynyt");
        jasper.kerroMitaOnPaalla();
        System.out.println("------------------------------------------\n");
        
        System.out.println("Hei, olen nyt insinööri-opiskelija");
        jasper.pukeudu(AdidasVaateTehdas.getInstance());
        jasper.kerroMitaOnPaalla();
        System.out.println("------------------------------------------\n");
        
        System.out.println("Hei, olen nyt valmistunut insinööriksi");
        jasper.pukeudu(BossVaateTehdas.getInstance());
        jasper.kerroMitaOnPaalla();
        System.out.println("------------------------------------------\n");
    }
    
}
