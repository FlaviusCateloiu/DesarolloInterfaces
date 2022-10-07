import javax.swing.*;
import java.awt.*;

public class PrimeraVentana extends JFrame {
    public PrimeraVentana() {
        super("Mi primera ventana");
        /* Sirve para cambiar el fondo de color Blanco a Color rojo.
        getContentPane().setBackground(Color.RED); */
        setContentPane(new JLabel(new ImageIcon("Tema 02/PrimeraVentana/fondo.jpg")));
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PrimeraVentana();
    }
}
