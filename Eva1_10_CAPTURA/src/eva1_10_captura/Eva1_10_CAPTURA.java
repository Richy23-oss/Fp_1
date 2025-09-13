
package eva1_10_captura;

import java.util.Scanner;


public class Eva1_10_CAPTURA {

    
    public static void main(String[] args) {
        // VELOCIDAD = DISTANCIA / TIEMPO 
        //m / s
        //DECLARACION:
        double velocidad;
        double distancia;
        double tiempo;
        Scanner captu = new Scanner(System.in); 
        
        System.out.println("Introduce la distancia:");
        distancia = captu.nextDouble();
         System.out.println("Introduce el tiempo:");
        tiempo = captu.nextDouble();
         //CALCULO:
         velocidad = distancia / tiempo;
         System.out.println("La velociad es:");
         System.out.println(velocidad);
         System.out.println("m/s");
         
                
        
        
        
        
        
    }
    
}
