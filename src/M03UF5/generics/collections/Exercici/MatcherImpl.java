package M03UF5.generics.collections.Exercici;

import M03UF5.generics.collections.Exercici.Matcher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pep
 */
public class MatcherImpl implements Matcher {

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        Persona match = null;
        int puntsMillorCandidat = 0;
        int puntsActuals = 0;
        
        
        if(persona.getEdad()<18){
            throw new UnsupportedOperationException("La persona no pot ser menor d'edat");
        }else {
            for (Persona candidato : candidatos) {
                if(candidato.getEdad()>=18){
                    if (sexualitatCompatible(persona, candidato)){
                        if(edatCompatible(persona, candidato)) puntsActuals += 1;
                        if(edatCompatible(persona, candidato)) puntsActuals += 1;
                        if(persona.getAficiones() == candidato.getAficiones()) puntsActuals +=1;
                        if(puntsActuals > puntsMillorCandidat){
                            puntsMillorCandidat = puntsActuals;
                            match = candidato;
                        }
                    }
                }
            }
            return match;
        }
    }

    public boolean sexualitatCompatible(Persona persona, Persona candidato) {
        boolean compatible = false;
        
        if(persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL){
            if(candidato.getOrientacionSexual() == OrientacionSexual.BISEXUAL){
                compatible = true;
            }
            else if(candidato.getOrientacionSexual() == OrientacionSexual.HETERO){
                 if(persona.getSexo() != candidato.getSexo()) compatible = true;
            }
            else if(candidato.getOrientacionSexual() == OrientacionSexual.HOMO){
                if(persona.getSexo() == candidato.getSexo()) compatible = true;
            }
        } else if(persona.getOrientacionSexual() == OrientacionSexual.HETERO){
            if(persona.getSexo() != candidato.getSexo()){
                if(candidato.getOrientacionSexual() == OrientacionSexual.HETERO){
                    compatible = true;
                } else if (candidato.getOrientacionSexual() == OrientacionSexual.BISEXUAL){
                    compatible = true;
                }
            }
        }
        else if(persona.getOrientacionSexual() == OrientacionSexual.HOMO){
            if(persona.getSexo() == candidato.getSexo()){
                if(candidato.getOrientacionSexual() == OrientacionSexual.HOMO){
                    compatible = true;
                } else if (candidato.getOrientacionSexual() == OrientacionSexual.BISEXUAL){
                    compatible = true;
                }
            }
        }
        return compatible;
    }
    
    public boolean edatCompatible(Persona persona, Persona candidato){
        boolean compatible = false;
        
        if(persona.getEdad()-5 < candidato.getEdad() || persona.getEdad()+5 > persona.getEdad()){
            compatible =  true;
        }
        
        return compatible;
    }
    
    public boolean OrientacioPolitica(Persona persona, Persona candidato){
        boolean compatible = false;
        
        if(persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO){
            if(candidato.getOrientacionPolitica() == OrientacionPolitica.CENTRO) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.DERECHA) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) compatible = true;
        }
        else if(persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA){
            if(candidato.getOrientacionPolitica() == OrientacionPolitica.DERECHA) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.CENTRO) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.EZXTREMA_DERECHA) compatible = true;
        }
        else if(persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA){
            if(candidato.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.CENTRO) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) compatible = true;
        }
        else if(persona.getOrientacionPolitica() == OrientacionPolitica.EZXTREMA_DERECHA){
            if(candidato.getOrientacionPolitica() == OrientacionPolitica.DERECHA) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.EZXTREMA_DERECHA) compatible = true;
        }
        else if(persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA){
            if(candidato.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) compatible = true;
            else if(candidato.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) compatible = true;
        }
        
        return compatible;
    }

}