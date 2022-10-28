import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class VentanaEjercicio06 extends JFrame  {
    private JSlider controler;
    private JButton botonVolverJugar;

    public VentanaEjercicio06() {
        super("Diana Horizontal");
        setLayout(null);
        setResizable(false);

        botonVolverJugar = new JButton("Volver a Jugar");
        botonVolverJugar.setBounds(20, 120, 150, 30);
        add(botonVolverJugar);

        controler = new JSlider();
        controler.setBounds(160, 60, 500, 30);
        controler.setValue(0);
        add(controler);

        setSize(800, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        AtomicInteger valorRamdom = new AtomicInteger((int) (Math.random() * 90 + 10));
        controler.addChangeListener(e -> {
            int valor = controler.getValue();
            if (!controler.getValueIsAdjusting()) {
                VentanaScoreEj06 jDialog = new VentanaScoreEj06(this, valor, valorRamdom.get());
            }
        });

        botonVolverJugar.addActionListener(e -> {
            valorRamdom.set((int) (Math.random() * 90 + 10));
            controler.setValue(0);
        });
    }

    public static void main(String[] args) {
        VentanaEjercicio06 ventana = new VentanaEjercicio06();
    }
}
