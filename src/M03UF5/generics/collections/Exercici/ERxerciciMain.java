package M03UF5.generics.collections.Exercici;

import java.util.ArrayList;
import java.util.List;

public class ERxerciciMain {

    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList();
        listaPersonas.add(new Persona(1, Sexo.HOMBRE, 28, false, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.EXTREMA_IZQUIERDA, Aficiones.ARTE));
        listaPersonas.add(new Persona(2, Sexo.MUJER, 28, false, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.IZQUIERDA, Aficiones.DANZA));
        listaPersonas.add(new Persona(3, Sexo.HOMBRE, 35, true, OrientacionSexual.HOMO, Formacion.CATEDRATICO, OrientacionPolitica.CENTRO, Aficiones.DEPORTES));
        listaPersonas.add(new Persona(4, Sexo.MUJER, 15, false, OrientacionSexual.BISEXUAL, Formacion.PRIMARIA, OrientacionPolitica.IZQUIERDA, Aficiones.LECTURA));
        listaPersonas.add(new Persona(5, Sexo.HOMBRE, 18, true, OrientacionSexual.HOMO, Formacion.SECUNDARIA, OrientacionPolitica.DERECHA, Aficiones.VIDEOJUEGOS));
        listaPersonas.add(new Persona(6, Sexo.MUJER, 30, false, OrientacionSexual.HOMO, Formacion.GRADO_SUPERIOR, OrientacionPolitica.EXTREMA_IZQUIERDA, Aficiones.DEPORTES));

        MatcherImpl m = new MatcherImpl();
        
        Persona match = m.matches(new Persona(0, Sexo.MUJER, 18, false, OrientacionSexual.HOMO, Formacion.PRIMARIA, OrientacionPolitica.EXTREMA_IZQUIERDA, Aficiones.VIDEOJUEGOS), listaPersonas);
        if (match == null) System.out.println("No hi ha cap match possible");
        else System.out.println(match);
    }

}