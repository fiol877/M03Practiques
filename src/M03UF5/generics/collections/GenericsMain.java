package M03UF5.generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Double;


/**
 * que retorne el ultimo elemento de la lista
 * 
 * que retorne la media de una lista de double
 * 
 * que retorne la cadena mas larga de una lista de cadenas
 * 
 * el maximo de una cadena de enteros
 * 
 * 
 * 
 * 
 * @author Bernat
 */


public class GenericsMain {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("Marta");
        lista1.add("Eva");
        lista1.add("Joan");
        lista1.add("Carles");
        lista1.add("Pep");
        
        List<Double> listMedia = new ArrayList<Double>();
        listMedia.add(1.8);
        listMedia.add(5.0);
        listMedia.add(5.4);
        listMedia.add(8.77);
        
        List<Integer> listaInts = new ArrayList<Integer>();
        listaInts.add(7);
        listaInts.add(50);
        listaInts.add(4);
        listaInts.add(1);
        
        
        if (!lista1.isEmpty()){
            System.out.println(ultimo(lista1));
        } else {
            System.out.println("La Llista esta buida");
        }
        
        
        if (!listMedia.isEmpty()){
            System.out.println(media(listMedia));
        } else {
            System.out.println("La Llista esta buida");
        }
        
        if (!lista1.isEmpty()){
            System.out.println(masLargo(lista1));
        } else {
            System.out.println("La Llista esta buida");
        }
        
        if (!listaInts.isEmpty()){
            System.out.println(maxim(listaInts));
        } else {
            System.out.println("La Llista esta buida");
        }
        
        
    }
    
    
    public static <T> T ultimo(List<T> lista){
        return lista.get(lista.size()-1);
    }
    
    public static Double media(List<Double> lista){
        double suma = 0;
        
        for(int i=0; i<lista.size(); i++){
            suma += lista.get(i);
        }
        return suma/lista.size();
    }
    
    public static String masLargo(List<String> lista){
        int mesGran = 0;
        String str = "";
        
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).length()>mesGran){
                str = lista.get(i);
                mesGran = lista.get(i).length();
            }
        }
        return str;
    }
    
    public static Integer maxim(List<Integer> lista){
        int mesGran = 0;
        
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i) > mesGran){
                mesGran = lista.get(i);
            }
        }
        return mesGran;
    }
    
}
