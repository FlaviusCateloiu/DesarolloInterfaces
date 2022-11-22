import javax.swing.*;

public class Celda extends JLabel {
    private String barco;
    private boolean seleccionado;

    public Celda() {
        this.seleccionado = false;
    }

    public void seleccionarBarco() {
        this.seleccionado = true;
    }

    public String getBarco() {
        return barco;
    }

    public void setBarco(String barco) {
        this.barco = barco;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
}
