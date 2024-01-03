package Fizz_Buzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Crear un código que, dependiendo de un valor "n", establecido por el mismo usuario, identifique si un valor es múltiplo de uno de dos números establecidos por el
 * usuario, si es múltiplo de ambos o si no lo es de ninguno, en caso de que sea múltiplo del primer número, el código debe devolver 
 * la palabra "Fizz"; para el segundo múltiplo la palabra "Buzz", en caso de que sea múltiplo de ambos "FizzBuzz" y si no es múltiplo
 * de ninguno que imprima el número.
*/

public class identificar_multiplo {

    public static void main(String[] args) throws IOException{

    // Digitado de datos del usuario para el método "Fizz_Buzz".
    //
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(bufferedReader.readLine().trim());

        int multiplo_1 = Integer.parseInt(bufferedReader.readLine().trim());

        int multiplo_2 = Integer.parseInt(bufferedReader.readLine().trim());

        Comparation.Fizz_Buzz(n, multiplo_1, multiplo_2);

        bufferedReader.close();
    }
}

class Comparation {

    /*  Se crea una iteración con condicionantes para que, dado el número de iteraciones "n", se compruebe si los números son 
        divisibles entre "multiplo_1" (se imprime el mensaje "Fizz"), "multiplo_2" (se imprime el mensaje "Buzz"), ambos 
        (se imprime el mensaje "FizzBuzz") o ninguno (se imprime el número actual de la iteración).
    */
    public static void Fizz_Buzz(int n, int multiplo_1, int multiplo_2) {

        for (int i=1; i<=n;i++){
            
            if ((i % multiplo_1==0 && i % multiplo_2==0)) {
                System.out.println("FizzBuzz");

                } else if (i % multiplo_1==0) {
                    System.out.println("Fizz");

                    } else if (i % multiplo_2==0) {
                        System.out.println("Buzz"); 

                        } else {
                            System.out.println(i);
                        }
        }
    }
}


