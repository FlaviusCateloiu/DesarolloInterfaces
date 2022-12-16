package ProcesoDeInstalacion;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SegundaVentana extends JFrame {
    private JPanel jPSegundaVentana;
    private JButton aceptarButton;
    private JTextField cUsuarioPepeAppsTextField;
    private JButton searchButton;
    private JCheckBox generarEjecutableEscritorioCheckBox;
    private JButton atrasButton;

    public SegundaVentana(PrimeraVentana primeraVentana) {
        super("Segunda Ventana");

        cUsuarioPepeAppsTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (cUsuarioPepeAppsTextField.getText().isEmpty()) {
                    aceptarButton.setEnabled(false);
                } else {
                    aceptarButton.setEnabled(true);
                }
            }
        });

        atrasButton.addActionListener(a -> {
            setVisible(false);
            primeraVentana.setVisible(true);
        });

        aceptarButton.addActionListener(a -> {
            setVisible(false);
            TerceraVentana terceraVentana = new TerceraVentana(this);
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });

        searchButton.addActionListener(a -> {
            JOptionPane.showMessageDialog(this, "Tienes que escribir en el text Field la ruta para poder continuar.", "Ruta", JOptionPane.INFORMATION_MESSAGE);
        });

        setContentPane(jPSegundaVentana);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 200);
        setVisible(true);
    }
}
