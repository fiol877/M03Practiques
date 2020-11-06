package M03UF5.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EstudianteMain  {
    
    class AlumnoNotaCoparator implements Comparator<Estudiante>{
    
    @Override
    public int compare(Estudiante o1, Estudiante o2){
        if(o1.getNota()<o2.getNota()) return -1;
        else if (o1.getNota() == o2.getNota()) return 0;
        else return 1;
    }
}
    
    public static void main(String[] args) {
        List<Estudiante> listaAlumnos = new ArrayList();
        listaAlumnos.add(new Estudiante("Pog", 0.0));
        listaAlumnos.add(new Estudiante("Nymn", 5.8));
        listaAlumnos.add(new Estudiante("Elias", 10.0));
        listaAlumnos.add(new Estudiante("Sebastian", 8.5));
        listaAlumnos.add(new Estudiante("Zip", 7.2));
        
        
        System.out.println("Ordenar per nom");
        Collections.sort(listaAlumnos);
        System.out.println(listaAlumnos);
        
       /* System.out.println("Ordenar per nota");
        Collections.sort(listaAlumnos, new AlumnoNotaCoparator());
        System.out.println(listaAlumnos);
        */
    }
}
