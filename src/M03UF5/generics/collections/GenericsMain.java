package M03UF5.generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Double;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class AlumnoEdadCoparator implements Comparator<Alumno>{
    
    @Override
    public int compare(Alumno o1, Alumno o2){
        if(o1.getEdad()<o2.getEdad()) return -1;
        else if (o1.getEdad() == o2.getEdad()) return 0;
        else return 1;
    }
}

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
        
        
        /*if (!lista1.isEmpty()){
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
        */
        
        
        //Proves amb el Set
        
//        Set<Alumno> set = new HashSet<>();
//        set.add(new Alumno("Pepe", 34));
//        set.add(new Alumno("Ana", 28));
//        set.add(new Alumno("Pere", 45));
//        set.add(new Alumno("Pepe", 34));
//        
//        
//        for(Iterator i = set.iterator(); i.hasNext();){
//            System.out.println(i.next());
//        }
        
        /*Iterator i = set.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
        */
        
        //Proves amb el Map i Collections
        Map<Integer, Alumno> mapa = new HashMap<>();
        mapa.put(1, new Alumno("Pepe", 34));
        mapa.put(1, new Alumno("Ana", 28));
        mapa.put(3, new Alumno("Pere", 45));
        mapa.put(4, new Alumno("Marc", 44));
        
        Alumno alumno = mapa.get(3);
        System.out.println(alumno);
       
        Set<Integer> claves = mapa.keySet();
        for(Iterator i = claves.iterator(); i.hasNext();){
            System.out.println(mapa.get(i.next()));
        }
        
        Collection<Alumno> col = mapa.values();
        for(Iterator ic = col.iterator(); ic.hasNext();){
            System.out.println(ic.next());
        }
       
        Collections.reverse(lista1);
        System.out.println(lista1);


        //Ordenar una coleccio
        
        List<Alumno> listaAlumnos = new ArrayList();
        listaAlumnos.add(new Alumno("Pog", 23));
        listaAlumnos.add(new Alumno("Nymn", 50));
        listaAlumnos.add(new Alumno("Elias", 30));
        listaAlumnos.add(new Alumno("Sebastian", 2));
        
        Collections.sort(listaAlumnos);
        System.out.println(listaAlumnos);
        
        //Comparador, clase mes adalt
        System.out.println("Comparator time");
        List<Alumno> listaAlumnosC = new ArrayList();
        listaAlumnosC.add(new Alumno("Pog", 23));
        listaAlumnosC.add(new Alumno("Nymn", 50));
        listaAlumnosC.add(new Alumno("Elias", 30));
        listaAlumnosC.add(new Alumno("Sebastian", 2));
        Collections.sort(listaAlumnosC, new AlumnoEdadCoparator());
        System.out.println(listaAlumnosC);
        
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
