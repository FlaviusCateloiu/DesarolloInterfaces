import javax.swing.*;
import java.awt.*;

public class Gui02 extends JFrame {
    public Gui02() {
        super("Ejemplo con FlowLayout.");
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        for (int i = 1; i <= 10; i++) {
            add(new JButton("Componente " + i));
        }
        setSize(450, 250);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui02 ventana = new Gui02();
    }
}
