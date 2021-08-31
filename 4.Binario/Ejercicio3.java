import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        /* Los ficheros .dat guardan la información en binario porque cuando se utilizan
    	 * normalmente se requiere una lectura completa del fichero por lo que se optimiza si
    	 * se almacena en binario
    	 */
        File f = new File("modulos.dat");
        FileInputStream filein = new FileInputStream(f);
        DataInputStream dataIS = new DataInputStream(filein);

        
        String n;
        int h;
        
        try{
        while (true) {
            n = dataIS.readUTF();
            h = dataIS.readInt();
            System.out.println("Modulo: " + n + ", Horas: " + h);
        }
        }catch (EOFException eof){
            
        }

        dataIS.close();

    }

}

