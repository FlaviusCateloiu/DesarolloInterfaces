import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private boolean introducido;
    private int longitud;
    private Color color;

    public Barco(String nombre, int longitud, Color color) {
        this.nombre = nombre;
        this.introducido = false;
        this.longitud = longitud;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isIntroducido() {
        return introducido;
    }

    public void setIntroducido(boolean introducido) {
        this.introducido = introducido;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static java.util.List<Barco> crearListaBarcos() {
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Aircraft", 5, Color.BLUE));
        barcos.add(new Barco("Battleship", 4, Color.YELLOW));
        barcos.add(new Barco("Submarine", 3, Color.GREEN));
        barcos.add(new Barco("Cruiser", 3, Color.PINK));
        barcos.add(new Barco("Destroyer", 2, Color.ORANGE));

        return barcos;
    }
}
