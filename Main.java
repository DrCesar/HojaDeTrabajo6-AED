
import java.util.Iterator;
import java.util.Scanner;
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
public class Main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);        
        Factory fab = new Factory();
        Set jcfJava;
        Set jcfWeb;
        Set jcfCel;
        Boolean seguirPidiendo = true;
        int contJava = 0;
        int contWeb = 0;
        int contCel = 0;
        
        System.out.println("Ingrese la opcion que desee utilizar.(1.HashSet, 2.TreeSet, 3.LinkedHashSet.) ");
        String opcion = scan.nextLine();
        
        jcfJava = fab.objetnerSet(opcion);
        jcfWeb = fab.objetnerSet(opcion);
        jcfCel = fab.objetnerSet(opcion);
        
        
        while(seguirPidiendo){
            System.out.println("Ingrese el nombre del usuario.");
            String name = scan.nextLine();
            
            System.out.println("Ingrese 1 si es desarollador Java, 0 si no.");
            String isJava = scan.nextLine();
            if(isJava.equals("1")){
                jcfJava.add(name);
                contJava++;
            }
            
            System.out.println("Ingrese 1 si es desarollador Web, 0 si no.");
            String isWeb = scan.nextLine();
            if(isWeb.equals("1")){
                jcfWeb.add(name);
                contWeb++;
            }        
                
            System.out.println("Ingrese 1 si es desarollador Cel, 0 si no.");
            String isCel = scan.nextLine();
            if(isCel.equals("1")){
                jcfCel.add(name);
                contCel++;
            }
            System.out.println("Ingrese 1 si quiere seguir ingresando usuarios, 0 si no.");
            String haySig = scan.nextLine();
            if(!haySig.equals("1"))
                seguirPidiendo = false;
        }
        
        System.out.println("Los programadores de Java, Web, Cel son: ");
        Iterator itrJava = jcfJava.iterator();
        Iterator itrWeb = jcfWeb.iterator();
        Iterator itrCel = jcfCel.iterator();
        Object obJava;
        Object obWeb;
        Object obCel;
        while(itrJava.hasNext()) {
            obJava = itrJava.next();
            
            if(jcfJava.contains(obJava) && jcfWeb.contains(obJava) && jcfCel.contains(obJava))
                System.out.println(obJava);
        }
        
        System.out.println("Los programadores de Java y no de Web son: ");
        itrJava = jcfJava.iterator();
        itrWeb = jcfWeb.iterator();
        itrCel = jcfCel.iterator();
        while(itrJava.hasNext()) {
            obJava = itrJava.next();
            
            if(jcfJava.contains(obJava) && !jcfWeb.contains(obJava))
                System.out.println(obJava);
        }
        
        System.out.println("Los programadores de Web y Cel y no de Java son: ");
        itrJava = jcfJava.iterator();
        itrWeb = jcfWeb.iterator();
        itrCel = jcfCel.iterator();
        while(itrWeb.hasNext()) {
            obWeb = itrWeb.next();
            
            if(!jcfJava.contains(obWeb) && jcfWeb.contains(obWeb) && jcfCel.contains(obWeb))
                System.out.println(obWeb);
        }
        
        System.out.println("Los programadores de Web o Cel y no de Java son: ");
        itrJava = jcfJava.iterator();
        itrWeb = jcfWeb.iterator();
        itrCel = jcfCel.iterator();
        while(itrWeb.hasNext()) {
            obWeb = itrWeb.next();
            
            if(!jcfJava.contains(obWeb) && (jcfWeb.contains(obWeb) || jcfCel.contains(obWeb)))
                System.out.println(obWeb);
        }
        
        itrJava = jcfJava.iterator();
        boolean isSubCon = true;
        while(itrJava.hasNext()) {
            obJava = itrJava.next();
            
            if(!jcfWeb.contains(obJava))
                isSubCon = false;
        }
        if(isSubCon)
            System.out.println("Los programadores de Java son un subconjunto de los de Web.");
        else
            System.out.println("Los programadores de Java no son un subconjunto de los de Web.");
    }
}
