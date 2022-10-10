import javax.swing.*;

public class Ejercicio02_3 extends JFrame {
    private JTextField text;

    public Ejercicio02_3() {
        super("Prueba");
        text = new JTextField("Introduce un texto");
        add(text);
        setSize(600, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ejercicio02_3 ventana = new Ejercicio02_3();
    }
}
