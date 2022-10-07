import javax.swing.*;
import java.awt.*;

public class Ejemplo02 extends JFrame {
    private JButton miBoton;
    private JButton cerrarBoton;
    private JButton madriguera;

    public Ejemplo02() {
        super("Ejemplo 02 con botón");
        miBoton = new JButton("Aceptar");
        cerrarBoton = new JButton("Cerrar");
        setLayout(new GridLayout(3, 4));
        add(miBoton);
        add(cerrarBoton);
        setSize(600, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ejemplo02 ventana = new Ejemplo02();
    }
}
