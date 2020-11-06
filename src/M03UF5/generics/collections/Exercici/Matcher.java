package M03UF5.generics.collections.Exercici;

import M03UF5.generics.collections.Exercici.Persona;
import java.util.List;


public interface Matcher {
    Persona matches(Persona persona, List<Persona> candidatos);
}
