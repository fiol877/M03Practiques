package M03UF5;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regexp {

    /*
    que valide NIF
    que valide NIE
    numero de movil de espanya
    matriculas de coche 4 digitos 3 letras sin vocales
    una fecha dd/mm/aa
    Email
    */
    
    public static void main(String[] args) {
        validarNIF("48211435P");
        validarNIE("Y4211435P");
        validarMobil("664587258");
        validarMobilEspanya("+34664587258");
        validarMatricula("4342 YHS");
        validarData("31/12/2005");
        validarEmail("fiol.carmona.bernat@alumnat.copernic.cat");
        
        
    }
    
    
    public static void validarNIF(String nif){
        Pattern p = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher m1 = p.matcher(nif);
        boolean b = m1.matches();
        
        if(b==true) System.out.println("Format del DNI correcte");
        else System.out.println("Format del DNI incorrecte");
    }
    
    public static void validarNIE(String nie){
        Pattern p = Pattern.compile("[XYZ][0-9]{7}[A-Z]");
        Matcher m1 = p.matcher(nie);
        boolean b = m1.matches();
        
        if(b==true) System.out.println("Format del NIE correcte");
        else System.out.println("Format del NIE incorrecte");
    }
    
    public static void validarMobil(String mobil){
        Pattern p = Pattern.compile("[0-9]{9}");
        Matcher m1 = p.matcher(mobil);
        boolean b = m1.matches();
        
        if(b==true) System.out.println("Format del numero de mobil correcte");
        else System.out.println("Format del numero de mobil incorrecte");
    }
    
    public static void validarMobilEspanya(String mobilE){
        Pattern p = Pattern.compile("^[+]34[0-9]{9}");
        Matcher m1 = p.matcher(mobilE);
        boolean b = m1.matches();
        
        if(b==true) System.out.println("Format del numero de mobil espanyol correcte");
        else System.out.println("Format del numero de mobil espanyol incorrecte");
    }
    
    public static void validarMatricula(String matricula) {
        Pattern p = Pattern.compile("[0-9]{4}[\\p{Blank}][BCDFGHJKLMNPRSTVWXYZ]{3}");
        Matcher m1 = p.matcher(matricula);
        boolean b = m1.matches();
        
        if(b==true) System.out.println("Format del numero de matricula correcte");
        else System.out.println("Format del numero de mobil matricula incorrecte");
    }
    
    public static void validarData(String data){
        Pattern p = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((18|19|20|21)\\d\\d)");
        Matcher m1 = p.matcher(data);
        boolean b = m1.matches();
        
        if(b==true) System.out.println("Format de la data correcte");
        else System.out.println("Format de la data incorrecte");
    }
    
    public static void validarEmail(String email){
        Pattern p = Pattern.compile("[\\w!#$%&'*+-/=?^_`{|}~]+@[\\w\\.]+\\.[a-z]+");
        Matcher m1 = p.matcher(email);
        boolean b = m1.matches();
        
        if(b==true) System.out.println("Format del email correcte");
        else System.out.println("Format del email incorrecte");
    }
//@[\\w]+.[a-z]+}
}
