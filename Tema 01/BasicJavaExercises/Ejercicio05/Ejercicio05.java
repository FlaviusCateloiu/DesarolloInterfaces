import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ejercicio05 {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        reader = new FileReader("Tema 01/BasicJavaExercises/Ejercicio05/file.txt");
        int current = reader.read();
        while (current != -1) {
            System.out.print((char) current);
            current = reader.read();
        }
        reader.close();
    }
}
