package factories;

import java.util.ArrayList;
import java.util.List;
import vaatteet.Vaate;


public class BossVaateTehdas extends VaateTehdas {
    
    private final String MERKKI = "Boss";
    private static BossVaateTehdas INSTANCE;

    
    private BossVaateTehdas() {
        List vaatteet = new ArrayList();
        String[] vaateTyypit = {"farmarit", "t-paita", "lippis", "kengät"};
        
        for(String vaateTyyppi : vaateTyypit){
            vaatteet.add(new Vaate(vaateTyyppi, MERKKI));
        }
        super.setVaatteet(vaatteet);
    }
    
    public static BossVaateTehdas getInstance(){
        
        if(INSTANCE == null) INSTANCE = new BossVaateTehdas();
        
        return INSTANCE;
    }
    
}
