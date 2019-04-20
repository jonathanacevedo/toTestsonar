/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cidenetprueba;

import java.util.Scanner;

/**
 *
 * @author jonatha.payares
 */
public class BinaryCandy {
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el número de Lucia: \n");
            int n = sc.nextInt();   
            calculateXeY(n);
            
        }
        
        
        //Función que devuelve la combinación de números que da mayor cantidad de dulces.
        public static String calculateXeY(int n){
            
            int mayor = 0;
            int x,y;
            String combination = "";
            int numCandys;
            for (int i = 1; i < n; i++) {   //Calcula todas las combinaciones posibles
                x = n-i;
                y = i;
                numCandys = countCandys(convertToBinary(x)) + countCandys(convertToBinary(y)); //Cuenta los 1 con la combinación
                if(numCandys > mayor){                                                    //Actualiza la mayor cantidad de dulces
                    combination = x+", "+y;
                    mayor = numCandys;
                }               
                
            }
            
            System.out.println("El mayor número de dulces para "+n+" es: "+mayor);
            System.out.println("Con los números: "+combination);

            
            
            return "";
        }
        
        //Función para convertir enteros a binarios
        public static String convertToBinary(int n){
            
            String binary = "";
            
            int residue = 0;
            while (n != 0){                                     //modulamos y concatenamos cada binario
                residue = n % 2;
                binary = binary.concat(Integer.toString(residue));
                n = n/2;

            }
            return reverseString(binary);                       //Reversamos la cadena obtenida para tener el binario real.
        }
        
        
        //Función que reversa la cadena enviada, en este caso la cadena de binarios
        public static String reverseString(String binary){
            
            String binaryResult = "";
                        
            for (int i = binary.length()-1; i >= 0; i--) {      //Invierte y acumula
                binaryResult += binary.charAt(i);
                
            }
            return binaryResult;
        }
        
        
        //Función que cuenta el número de dulces que dará el binario enviado.
        public static int countCandys(String binary){
            
            int count = 0;
            for (int i = 0; i < binary.length(); i++) { //Contamos los 1 que tenga el binario.
                if(binary.charAt(i)=='1'){
                    count++;
                }
            }
            
            return count;
        }
         
}
