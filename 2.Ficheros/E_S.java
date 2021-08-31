import java.io.File;
import java.io.IOException;

public class E_S {

    public static void main(String[] args) throws IOException {
        File f = new File(".");
        File [] hijos = f.listFiles();
        StringBuilder msj = new StringBuilder();
        for (File e : hijos) {
            msj.append(e.getName()).append('\t')
                    .append(e.lastModified()).append('\t')
                    .append(e.canRead()).append('\t')
                    .append(e.canWrite()).append('\t')
                    .append(e.isHidden()).append('\t')
                    .append(e.length()).append('\n');
        }
        System.out.println(msj.toString());
        
        File f2 = new File("NuevaCarpeta");
        f2.mkdir();
        
        for (File e : hijos) {
            if (e.isFile() && !e.getName().equals("pom.xml")) {
                String nuevoNombre = f2.getPath() + File.separatorChar + e.getName();
                File nuevo = new File(nuevoNombre);
                e.renameTo(nuevo);
            }
        }
        
        File f3 = new File("ficherosMovidos.txt");
        f3.createNewFile();
        
        f3.setExecutable(false);
        f3.setReadable(false);
        f3.setWritable(false);
        
    }
    
}
