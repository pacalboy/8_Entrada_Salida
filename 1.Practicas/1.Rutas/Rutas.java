import java.io.File;

public class Rutas {

    public static void main(String[] args) {
        File f = new File("Carpeta/HOLA.txt");
        
        if (f.isFile()) {
            System.out.println(f.getParent());
            System.out.println(f.getAbsolutePath());
            String nuevoNombre = f.getParent() + File.separatorChar + "hola.txt";
            File nuevo = new File(nuevoNombre);
            f.renameTo(nuevo);
        }else if (f.isDirectory()) {
            File [] hijos = f.listFiles();
            for (File it : hijos) {
                System.out.println(it.getName());
            }
        }
        
    }
    
}
