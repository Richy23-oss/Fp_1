
package eva1_9_captura;

import java.util.Scanner;


public class Eva1_9_CAPTURA {

    
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        System.out.println("introduce tu nombre completo: ");
        //CAPTURA DE DATOS
        Scanner input = new Scanner(System.in); //ESTO CREA EL ESCANER
        nombre = input.nextLine(); //ESTA LINEA CAPUTRA EL TEXTO (nextLine)
        System.out.println("Introduce tu edad");
        edad = input.nextInt();
        System.out.println("Captura tu promedio");
        promedio = input.nextDouble();
        System.out.println(nombre);
        System.out.println("La edad es: ");
        System.out.println(edad);
        System.out.println("Tu promedio es: ");
        System.out.println(promedio);
        
        
    }
    
}
