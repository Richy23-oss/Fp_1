
package eva1_14_descuento;

import java.util.Scanner;


public class Eva1_14_DESCUENTO {

    
    public static void main(String[] args) {
        double montoVenta, montoPagar;
        Scanner captu = new Scanner (System.in);
        System.out.println("monto de la compra:");
        montoVenta = captu.nextDouble();           
        if (montoVenta>1000){
            montoPagar=montoVenta * 0.85;
            
        System.out.println("Debes de pagar:");
                System.out.println("monto de la compra:");
                System.out.println(montoPagar);

             

                    

            
        }        
                
    }
    
}
