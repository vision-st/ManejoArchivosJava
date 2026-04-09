import java.io.*;
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

    private static void registrarVenta(Scanner scanner) {
        System.out.println("Ingrese el nombre de un producto: ");
        String producto = scanner.nextLine();
        System.out.println("Ingrese la cantidad: ");
        double cantidad = scanner.nextDouble();

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ventas.txt", true))){
            bufferedWriter.write("Producto: " + producto + " | Cantidad: " + cantidad + " kg");
            bufferedWriter.newLine();
            System.out.println("Venta guardada correctamente");
        }catch(IOException e){
            System.out.println("Error al guardar venta " + e.getMessage());
        }
    }

    private static void mostrarVentas() {
        try(BufferedReader bf = new BufferedReader(new FileReader("ventas.txt"))){
            String linea;
            System.out.println("====REGISTRO DE VENTAS=====");
            while((linea = bf.readLine()) != null){
                System.out.println(linea);
            }
            System.out.println("====FIN DEL REGISTRO====");
        }catch(IOException e){
            System.out.println("Error al leer ventas, no se encontraron registros " + e.getMessage());
        }
    }



}
