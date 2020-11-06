package M03UF5.generics.collections.Exercici;

/**
 *
 * @author pep
 */
public class Persona {
    
    private int id;
    private Sexo sexo;
    private int edad;
    private boolean fumador;
    private OrientacionSexual orientacionSexual;
    private Formacion formacion;
    private OrientacionPolitica orientacionPolitica;

    public Persona(int id, Sexo sexo, int edad, boolean fumador, OrientacionSexual orientacionSexual, Formacion formacion, OrientacionPolitica orientacionPolitica) {
        this.id = id;
        this.sexo = sexo;
        this.edad = edad;
        this.fumador = fumador;
        this.orientacionSexual = orientacionSexual;
        this.formacion = formacion;
        this.orientacionPolitica = orientacionPolitica;
    }

    public int getId() {
        return id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isFumador() {
        return fumador;
    }

    public OrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public Formacion getFormacion() {
        return formacion;
    }

    public OrientacionPolitica getOrientacionPolitica() {
        return orientacionPolitica;
    }
        
    
}
