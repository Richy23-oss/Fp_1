
package eva1_15_mayor;

import java.util.Scanner;


public class Eva1_15_Mayor {

    
    public static void main(String[] args) {
        int numero1, numero2;
        
        Scanner input = new Scanner (System.in);
        System.out.println("numero 1");
        numero1 = input.nextInt();
        System.out.println("numero 2");
        numero2 = input.nextInt();
        
        if (numero1 > numero2){
        System.out.println("numero mayor");
        System.out.println(numero1);
        }else{
            if (numero2 > numero1){
                System.out.println("numero mayor es:");
                System.out.println(numero2);
               }else{
                System.out.println("los numeros son iguales");
            }
            }
        }
    }
    

