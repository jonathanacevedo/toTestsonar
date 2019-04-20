/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cidenetprueba;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jonatha.payares
 */
public class SumCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Función encargada de sumar los números ingresados en una cadena de 
            caracteres (enteros o reales)
        */

        int i                 = 0;
        double acum           = 0;
        double element;
        DecimalFormat decimal = new DecimalFormat("###.#");

        try{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la cadena de caracteres a ser sumados separados por espacios: \n");
            String values = sc.nextLine();                                      //Lee la cadena de carácteres

            StringTokenizer tokens = new StringTokenizer(values);               //Separa los tokens de la cadena

            do {                                                                 //Recorre y acumula los valores de los tokens
                element = Double.parseDouble(tokens.nextToken());
                acum +=  element;
            } while (i < tokens.countTokens()); 
            System.out.println("Resultado de la suma: " + decimal.format(acum)); //Imprime el resultado en formato decimal

        } catch(NumberFormatException e){
            System.out.println("Valor incorrecto: "+e.getMessage());
        }
       
    }
}
