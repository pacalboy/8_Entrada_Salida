import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        File f = new File("datos//movimientos.dat");
        FileOutputStream fileout = new FileOutputStream(f);
        ObjectOutputStream objectOS = new ObjectOutputStream(fileout);
        FileInputStream filein = new FileInputStream(f);
        ObjectInputStream objectIS = new ObjectInputStream(filein);
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        ArrayList<MovimientoBancario> lista = new ArrayList<>();
        MovimientoBancario movimiento;
        String fecha="";
        String concepto="";
        double cantidad=0;
        double saldo=0;
        boolean tipo=false;
        
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Introduce la fecha: ");
            fecha = teclado.nextLine();
            System.out.print("Introduce el concepto: ");
            concepto = teclado.nextLine();
            System.out.print("Introduce la cantidad: ");
            cantidad = teclado2.nextDouble();
            System.out.println("Introduce el tipo (TRUE/FALSE): ");
            tipo = teclado3.nextBoolean();
            movimiento = new MovimientoBancario(fecha,concepto,cantidad,tipo);
            lista.add(movimiento);
        }
        
        for (int i = 0; i < lista.size(); i++) 
        {
            objectOS.writeObject(lista.get(i));
        }
        
        objectOS.close();
        
        try{
        while (true) {
            MovimientoBancario m1 = (MovimientoBancario) objectIS.readObject();
            tipo = m1.getTipo();
            cantidad = m1.getCantidad();
            if (tipo==false) 
            {
                saldo=saldo+cantidad;
            }
            else
            {
                saldo=saldo-cantidad;
            }
            System.out.println(m1.toString());
        }
        }catch (EOFException eof){
            
        }

        objectIS.close();
        System.out.println("Saldo todal: "+saldo);

    }

}

