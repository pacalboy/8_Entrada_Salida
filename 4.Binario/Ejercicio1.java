import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fichero = null;
        PrintWriter pw = null;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Introduce la ruta del fichero a copiar: ");
            String ruta = teclado.nextLine();
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            fichero = new FileWriter("archivovacio.txt", false);
            pw = new PrintWriter(fichero);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                pw.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                    fichero.close();
                }
            } catch (IOException e2) {
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }
    }

}
