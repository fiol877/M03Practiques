package M03UF5.generics.collections.Exercici;

import M03UF5.generics.collections.Exercici.Matcher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pep
 */
public class MatcherImpl implements Matcher {
    Persona persona;
    List<Persona> candidatos;

    public MatcherImpl(Persona persona, List<Persona> candidatos) {
        this.persona = persona;
        this.candidatos = candidatos;
    }

    public Persona getPersona() {
        return persona;
    }

    public List<Persona> getCandidatos() {
        return candidatos;
    }
    

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        for(Persona candidato : candidatos){
            if(persona.getSexo() != candidato.getSexo()){
                if(persona.getOrientacionSexual() == OrientacionSexual.HETERO && candidato.getOrientacionSexual() == OrientacionSexual.HETERO){
                    
                }
            }
        }
    }
    
}
