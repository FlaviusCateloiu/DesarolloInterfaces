import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ejercicio05 {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("Tema 01/BasicJavaExercises/Ejercicio05/file.txt");
            int current = reader.read();
            while (current != -1) {
                System.out.print((char) current);
                current = reader.read();
            }
        } finally {
            reader.close();
        }
    }
}
