public class Barco {
    private String nombre;
    private boolean introducido;
    private int longitud;

    public Barco(String nombre, int longitud) {
        this.nombre = nombre;
        this.introducido = false;
        this.longitud = longitud;
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
}
