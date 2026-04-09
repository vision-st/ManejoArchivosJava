import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoEjemplo {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print(" Ingresa un NUMERO ENTERO:");
            int numero = scanner.nextInt();
            System.out.println("Divide por: ");
            int divisor = scanner.nextInt();
            int resultado = numero / divisor;
            System.out.println("Resultado: " + resultado);
        }catch(InputMismatchException e){
            System.out.println("Error: Debes ingresar un numero entero");
        }catch(ArithmeticException e){
            System.out.println("Error: No puedes dividir por 0");
        }finally {
            System.out.println("Programa terminado");
            scanner.close();
        }
    }
}
