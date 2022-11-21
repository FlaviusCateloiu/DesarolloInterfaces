import javax.swing.*;

public class Barco extends JLabel {
    private boolean seleccionado;

    public Barco() {
        this.seleccionado = false;
    }

    public void seleccionarBarco() {
        this.seleccionado = true;
    }
}
