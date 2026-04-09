import java.util.Scanner;

public class VerduleriaDonJaime {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n==== VERDULERIA DON JAIME ====");
            System.out.println("1. Registrar Venta");
            System.out.println("2. Ver todas las ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            if(opcion == 1){
                registrarVenta(sc);
            } else if(opcion == 2){
                mostrarVentas();
            } else if(opcion == 3){
                System.out.println("Chao");
            } else {
                System.out.println("Opcion invalida");
            }
            
        }while(opcion != 3);
    }

    private static void mostrarVentas() {

    }

    private static void registrarVenta(Scanner sc) {

    }

}
