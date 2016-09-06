
import java.util.Iterator;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Calculos {
    
    
    public void isJavaSubset(Set java, Set web){
        Iterator itrJava;
        Object obJava;
        
        itrJava = java.iterator();
        boolean isSubCon = true;
        while(itrJava.hasNext()) {
            obJava = itrJava.next();

            if(!web.contains(obJava))
                isSubCon = false;
        }  
        if(isSubCon)
            System.out.println("Los programadores de Java son un subconjunto de los de Web.");
        else
            System.out.println("Los programadores de Java no son un subconjunto de los de Web.");
    
    }
    
}
