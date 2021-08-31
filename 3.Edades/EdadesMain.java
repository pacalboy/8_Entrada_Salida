import com.github.javafaker.Faker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EdadesMain {

    public static void main(String[] args) {
        
        File f = new File("personas.txt");
        
        Random r = new Random();
        Faker faker = new Faker(new Locale("es"));
        List<Persona> personas = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            personas.add(new Persona(faker.name().firstName(), r.nextInt(120)));
        }
        
        
        try {
            f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            for (Persona p : personas) {
                fw.write(p.getName() + "-" + p.getEdad() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        personas = null;
        
        int n = 0;
        int suma = 0;
        try {
            Scanner sc = new Scanner(f);
            sc.useDelimiter("-");
            while (sc.hasNextLine()) {
                System.out.println(sc.next());  //me he quedado en las pruebas
                n++;                            
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EdadesMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(n);
    }
    
}
