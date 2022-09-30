import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ejercicio07 {
    public static void funcion() throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("file.txt");
        } finally {
            reader.close();
        }
        
        /* Este codigo es necesario para poder cerrar la lectura del fichero por si surge algun problema, 
        sino el archivo se quedari abierto y podria ocasionar problemas para el codigo que sigue. */
    }
}