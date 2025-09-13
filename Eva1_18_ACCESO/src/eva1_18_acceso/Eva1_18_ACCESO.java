 
package eva1_18_acceso;

import java.util.Scanner;


public class Eva1_18_ACCESO {
   final static String USUARIO= "Richy";
   final static String PWD= "1234";

    public static void main(String[] args) {
     String usu, contraseña;
     Scanner input = new Scanner (System.in);
    System.out.println("Bienvenido");
    System.out.println("Sistemma de venta Restaurante");
    System.out.println("Ingresa tu usuario");
    usu= input.nextLine();
    System.out.println("introduce tu contraseña");
    contraseña= input.nextLine();
    
    if(usu.equals(USUARIO)){
        if (contraseña.equals(PWD));
        System.out.println("acceso concedido");
        }else{
        System.out.println("acceso denegado");
    }
     }
    
         
    }
    

