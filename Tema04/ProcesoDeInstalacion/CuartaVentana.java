package ProcesoDeInstalacion;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CuartaVentana extends JFrame {
    private JButton finalizarButton;
    private JTextArea laInstalacionSeHaTextArea;
    private JPanel jPCuartaVentana;
    private JCheckBox ejecutarProgramaAlFinalizarCheckBox;

    public CuartaVentana() {
        super("Cuarta Ventana");

        finalizarButton.addActionListener(a -> {
            System.exit(0);
        });

        setContentPane(jPCuartaVentana);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 200);
        setVisible(true);
    }
}
