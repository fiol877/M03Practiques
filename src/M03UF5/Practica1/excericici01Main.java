package M03UF5.Practica1;

public class excericici01Main {

    public static void main(String[] args) {
        //Introduir un array de cinc nombres primers

        //no es primer
        //no son 5
        //esta buit
        int[] array = {2, 3, 5,};
        //int[] array = {2, -3, 4, 7, 11};

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
                        if (array[i] < 0) {
                            //throw new negatiu();
                            throw new NombreInvalidException();
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

    public static boolean esPrimo(int numero) {
        int num = numero;
        boolean esPrimo = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                esPrimo = true;
                break;
            }
        }
        return esPrimo;
    }
    
    public static void ComprovarExpecions(int[] array){
    }

}