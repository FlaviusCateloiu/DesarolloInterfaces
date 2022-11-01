import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class VentanaEjercicio06 extends JFrame  {
    private JSlider controler;
    private JButton botonVolverJugar;

    private JButton botonNivel1;
    private JButton botonNivel2;
    private JButton botonNivel3;
    private JButton botonAcercaDe;

    public VentanaEjercicio06() {
        super("Diana Horizontal");
        setLayout(null);
        setResizable(false);

        botonVolverJugar = new JButton("Volver a Jugar");
        botonVolverJugar.setBounds(1720, 120, 150, 30);
        add(botonVolverJugar);

        botonNivel1 = new JButton("Nivel1");
        botonNivel1.setBounds(20, 120, 150, 30);
        add(botonNivel1);

        botonNivel2 = new JButton("Nivel2");
        botonNivel2.setBounds(200, 120, 150, 30);
        add(botonNivel2);

        botonNivel3 = new JButton("Nivel3");
        botonNivel3.setBounds(400, 120, 150, 30);
        add(botonNivel3);

        botonAcercaDe = new JButton("Acerca De");
        botonAcercaDe.setBounds(1720, 10, 150, 30);
        add(botonAcercaDe);

        controler = new JSlider();
        controler.setBounds(20, 60, 1920/2, 30);
        controler.setValue(0);
        add(controler);

        setSize(1920, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        AtomicInteger valorRamdom = new AtomicInteger((int) (Math.random() * 100));
        controler.addChangeListener(e -> {
            int valor = controler.getValue();
            if (!controler.getValueIsAdjusting()) {
                VentanaScoreEj06 jDialog = new VentanaScoreEj06(this, valor, valorRamdom.get());
            }
        });

        botonNivel1.addActionListener(e -> {
            controler.setBounds(20, 60, 1920/10, 30);
        });

        botonNivel2.addActionListener(e -> {
            controler.setBounds(20, 60, 1920/2, 30);
        });

        botonNivel3.addActionListener(e -> {
            controler.setBounds(20, 60, 1860, 30);
        });
        botonAcercaDe.addActionListener(e -> {
            VentanaScoreEj06 ventanaAcercaDe = new VentanaScoreEj06(this);
        });

        botonVolverJugar.addActionListener(e -> {
            valorRamdom.set((int) (Math.random() * 100));
        });
    }

    public static void main(String[] args) {
        VentanaEjercicio06 ventana = new VentanaEjercicio06();
    }
}
