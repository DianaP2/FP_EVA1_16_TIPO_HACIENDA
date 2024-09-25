package eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class EVA1_16_TIPO_HACIENDA {

    public static void main(String[] args) {
        char tipo; //El char se utiliza para capturar letras
        Scanner captu=new Scanner(System.in);
        
        System.out.println("""
                           Tipo de persona:
                           F) Fisica
                           M) Moral
                           """);
        
        tipo=captu.nextLine().charAt(0);
        System.out.println("Ingresaste la letra " + tipo + " la persona es: ");

        //Imprimir rl tipo de persona
        
        if(tipo=='F'){ //Las comillas simples son para leer las letras
            System.out.println("Persona fisica");
        }else if (tipo=='M'){
            System.out.println("Persona moral");
        }else{
            System.out.println("La letra es incorrecta, intenta nuevamente");
        }
    }
    
}
