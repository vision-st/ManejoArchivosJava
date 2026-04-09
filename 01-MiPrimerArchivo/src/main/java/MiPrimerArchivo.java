import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MiPrimerArchivo {

    public static void main(String[]args){

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hola.txt"))){

            bufferedWriter.write("Hola, estoy manipulado por el bufferedWriter");
            bufferedWriter.newLine();
            bufferedWriter.write("Java es magnifico !");
            bufferedWriter.newLine();
            bufferedWriter.write("Imagina las posibilidades");
            bufferedWriter.newLine();
            System.out.println("Archivo creado con exito");

        }catch(IOException e){
            System.out.println("Error al escribir archivo: " + e.getMessage());
        }
    }
}
