package M03UF5.generics.collections.Exercici;

import java.util.ArrayList;
import java.util.List;

public class ERxerciciMain {

    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList();
        listaPersonas.add(new Persona(1, Sexo.HOMBRE, 28, false, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.EXTREMA_IZQUIERDA));
        listaPersonas.add(new Persona(1, Sexo.MUJER, 28, false, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.IZQUIERDA));
        listaPersonas.add(new Persona(1, Sexo.HOMBRE, 35, true, OrientacionSexual.GAY, Formacion.CATEDRATICO, OrientacionPolitica.CENTRO));
        listaPersonas.add(new Persona(1, Sexo.MUJER, 15, false, OrientacionSexual.BISEXUAL, Formacion.PRIMARIA, OrientacionPolitica.IZQUIERDA));
        listaPersonas.add(new Persona(1, Sexo.HOMBRE, 18, true, OrientacionSexual.GAY, Formacion.SECUNDARIA, OrientacionPolitica.DERECHA));
        listaPersonas.add(new Persona(1, Sexo.MUJER, 30, false, OrientacionSexual.LESBIANA, Formacion.GRADO_SUPERIOR, OrientacionPolitica.EXTREMA_IZQUIERDA));

        MatcherImpl m = new MatcherImpl(new Persona(1, Sexo.HOMBRE, 21, false, OrientacionSexual.BISEXUAL, Formacion.GRADO_MEDIA, OrientacionPolitica.IZQUIERDA), listaPersonas);
        
    }

}
