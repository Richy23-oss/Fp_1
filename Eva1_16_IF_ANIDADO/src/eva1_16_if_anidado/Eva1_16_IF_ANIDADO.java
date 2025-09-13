package eva1_16_if_anidado;
import java.util.Scanner;


public class Eva1_16_IF_ANIDADO {

    
    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner (System.in);
        System.out.println("captura el numero de dia (1 a 7)");
        dia=captu.nextInt();
        
        if (dia==1){
            System.out.println("domingo");
            }else if (dia ==2){
            System.out.println("lunes");
            }else if (dia ==3){
                System.out.println("martes");
            }else if (dia ==4){
                System.out.println("miercoles");
            }else if (dia ==5){
                System.out.println("jueves");
            }else if (dia ==6){
            System.out.println("viernes");
            }else if (dia ==7){
                System.out.println("sabado");
            }
         }
    }
    

