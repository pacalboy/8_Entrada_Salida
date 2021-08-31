import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        File f = new File("modulos.dat");
        FileOutputStream fileout = new FileOutputStream(f);
        DataOutputStream dataOS = new DataOutputStream(fileout);

        String modulos[] = {"PSP","DI","PMDM","SGE","Ingles","AD"};
        int horas[] = {3, 7, 4, 4, 3, 5};
        
        for( int i=0 ; i<modulos.length ; i++){
            dataOS.writeUTF(modulos[i]);
            dataOS.writeInt(horas[i]);
        }
        dataOS.close();
    }
    
}
