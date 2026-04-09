import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
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
}
