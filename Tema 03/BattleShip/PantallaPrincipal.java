import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PantallaPrincipal extends JFrame {
    private JButton jBJugar;
    private JButton jBSalir;
    private JLabel jLTitulo;
    private JPanel jPPrincipal;

    public PantallaPrincipal() {
        super("Hundir la Flota Pantalla Principal");

        jBJugar.addActionListener(a -> {
            IntroducirBarcos ventanaIntroducirBarcos = new IntroducirBarcos();
            setVisible(false);
            ventanaIntroducirBarcos.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setVisible(true);
                }
            });
        });

        jBSalir.addActionListener(a -> {
            System.exit(0);
        });

        setContentPane(jPPrincipal);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PantallaPrincipal pantalla = new PantallaPrincipal();
    }
}
