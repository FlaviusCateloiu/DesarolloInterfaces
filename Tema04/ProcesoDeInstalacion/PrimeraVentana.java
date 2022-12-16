package ProcesoDeInstalacion;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PrimeraVentana extends JFrame {
    private JPanel jPPrimeraVentana;
    private JButton aceptarButton;
    private JCheckBox jCBoxAcepCond;
    private JScrollPane jSPCondiones;
    private JTextPane aspectosLegalesDeLasTextPane;

    public PrimeraVentana() {
        super("Primera Ventana");

        jCBoxAcepCond.addActionListener(a -> {
            if (jCBoxAcepCond.isSelected()) {
                aceptarButton.setEnabled(true);
            } else {
                aceptarButton.setEnabled(false);
            }
        });

        aceptarButton.addActionListener(a -> {
            setVisible(false);
            SegundaVentana segundaVentana = new SegundaVentana(this);
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });
        
        setContentPane(jPPrimeraVentana);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        PrimeraVentana ventana = new PrimeraVentana();
    }
}
