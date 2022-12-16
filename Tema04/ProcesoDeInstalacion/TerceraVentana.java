package ProcesoDeInstalacion;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TerceraVentana extends JFrame {
    private JPanel jPTerceraVentana;
    private JButton aceptarButton;
    private JButton atrasButton;
    private JProgressBar progressBar1;
    private JLabel jLInstalacion;
    private JButton instalarButton;

    public TerceraVentana(SegundaVentana segundaVentana) {
        super("Tercera Ventana");

        instalarButton.addActionListener(a -> {
            fill();
        });

        atrasButton.addActionListener(a -> {
            setVisible(false);
            segundaVentana.setVisible(true);
        });

        aceptarButton.addActionListener(a -> {
            setVisible(false);
            CuartaVentana cuartaVentana = new CuartaVentana();
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });


        setContentPane(jPTerceraVentana);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 200);
        setVisible(true);
    }

    public void fill() {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    progressBar1.setValue(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                aceptarButton.setEnabled(true);
            }
        });
        hilo.start();
    }
}
