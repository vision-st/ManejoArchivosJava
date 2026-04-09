import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoNoExiste {

    public static void main(String[]args){
        try(BufferedReader bf = new BufferedReader(new FileReader("archivo_fantasma.txt"))){
            String linea;
            System.out.println("====REGISTRO DE VENTAS=====");
            while((linea = bf.readLine()) != null){
                System.out.println(linea);
            }
            System.out.println("====FIN DEL REGISTRO====");
        }catch(FileNotFoundException e){
            System.out.println("Error al leer ventas " + e.getMessage());
        }catch (IOException ex){
            System.out.println("Error general de lectura/escritura " + ex.getMessage());
        }
    }
}
