
import static java.lang.reflect.Array.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Factory {
    
    public Set objetnerSet(String s){
        switch(s){
            case "1":
                return new HashSet();
            case "2":
                return new TreeSet();
            case "3":
                return new LinkedHashSet();
        }
        return new HashSet();
    }
}
