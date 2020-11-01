package M03UF5.Practica1;

public class excericici01Main {

    public static void main(String[] args) {
        //Introduir un array de cinc nombres primers

        //no es primer
        //no son 5
        //esta buit
        
        int[] array1 = {2, 3, 5, 8, 12};
        int[] array2 = {2, 3, 5,};
        int[] array3 = {};
        int[] array4 = {2, 3, 5, 7, 11};
        
        System.out.println("Exemple d'error 1");
        ComprovarExpecions(array1);
        System.out.println("Exemple d'error 2");
        ComprovarExpecions(array2);
        System.out.println("Exemple d'error 3");
        ComprovarExpecions(array3);
        System.out.println("Comprobacio correcte");
        ComprovarExpecions(array4);
        

        
    }

    public static boolean esPrimo(int numero) {
        int num = numero;
        boolean esPrimo = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                esPrimo = true;
                break;
            }
        }
        return esPrimo;
    }
    
    public static void ComprovarExpecions(int[] array){
        
        try {
            if (array.length == 0) {
                throw new ArrayEstaBuitException();
            }
            try {
                
                if(array.length-1 != 4){
                    throw new ArrayNoEsDeCincException();
                }
                
                for (int i = 0; i < 5; i++) {
                    try {
                        if(esPrimo(array[i])){
                            throw new NombreInvalidException(array[i]);
                        }
                        
                    } catch (NombreInvalidException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } catch (ArrayNoEsDeCincException e) {
                System.out.println(e.getMessage());
            }

        } catch (ArrayEstaBuitException e) {
            System.out.println(e.getMessage());
        }
    }

}