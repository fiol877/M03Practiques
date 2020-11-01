package M03UF5.Practica1;

public class NombreInvalidException extends Exception{
    
    public NombreInvalidException(int num){
        super("Error. El nombre "+num+" no es un nombre primer");
    }
    
}
