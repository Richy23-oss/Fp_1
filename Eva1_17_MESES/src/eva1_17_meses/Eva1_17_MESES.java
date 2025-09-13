
package eva1_17_meses;

import java.util.Scanner;


public class Eva1_17_MESES {

   
    public static void main(String[] args) {
        int meses;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("captura el numero de mes (1 a 12)");
        meses = captu.nextInt();
        
        if(meses==1){
        System.out.println("enero");
        }else if (meses ==2){
    System.out.println("febrero");
        }else if (meses ==3){
        System.out.println("marzo");
        }else if (meses ==4){
        System.out.println("abril");
        }else if (meses ==5){
        System.out.println("mayo");
        }else if (meses ==6){
        System.out.println("junio");
        }else if (meses ==7){
        System.out.println("julio");
        }else if (meses ==8){
        System.out.println("agosto");
        }else if (meses ==9){
        System.out.println("septiembre");
        }else if (meses ==10){
        System.out.println("octubre");
        }else if (meses ==11){
        System.out.println("noviembre");
        }else if (meses ==12){
        System.out.println("diciembre");
        }else{
            System.out.println("numero no valido");
    }
    }
    }
    

