import java.io.*;

public class LeerVentas {
    public static void main(String[]args){
        try(BufferedReader bf = new BufferedReader(new FileReader("ventas.txt"))){
            String linea;
            System.out.println("====REGISTRO DE VENTAS=====");
            while((linea = bf.readLine()) != null){
                System.out.println(linea);
            }
            System.out.println("====FIN DEL REGISTRO====");
        }catch(IOException e){
            System.out.println("Error al leer ventas " + e.getMessage());
        }
    }
}
