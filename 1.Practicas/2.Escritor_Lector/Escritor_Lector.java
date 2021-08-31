package pacal.mavenproject1;

import com.github.javafaker.Faker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritor_Lector {

    public static int rellenarPersonas(List<Persona> lista, int n) {
        //Generador nombres aleatorios
        Faker faker = new Faker();
        Random generador = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(new Persona(
                    faker.name().firstName(),
                    generador.nextInt(120)));
        }
        return lista.size();
    }
    
    public static void main(String[] args) {
        File f = new File("mensaje.txt");
        int [] num = { 1,2,3,4,5,6,7,8,9,10};
        try {
            f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            for(int x : num){
                fw.write(Integer.toString(x) + ';');
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Escritor_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        List<Persona> invitados = new ArrayList<>();
        rellenarPersonas(invitados, 50);
        
        File fInvitados = new File("invitados.txt");
        try {
            fInvitados.createNewFile();
            FileWriter fw = new FileWriter(fInvitados);
            
            for(Persona p : invitados){
                fw.write(p.getNombre());
                fw.append('-');
                fw.write(Integer.toString(p.getEdad()));
                fw.append('\n');
            }
            
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Escritor_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File fVentas = new File("ventas.txt");
        int nVentas = 0;
        try {
            Scanner sc = new Scanner(fVentas);
            sc.useDelimiter(",");
            while(sc.hasNextInt()){
                nVentas += sc.nextInt();
            }
            System.out.println(nVentas);
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Escritor_Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
}
