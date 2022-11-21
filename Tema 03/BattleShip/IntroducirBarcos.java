import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class IntroducirBarcos extends JFrame {
    private Mapa mapaPlayer1;
    private JPanel jPIntroducirBarcos;
    private JPanel jPDatos;
    private JComboBox jCBSelectBarco;
    private JPanel jPBarcosIntroducidos;

    public IntroducirBarcos() {
        super("Introducir Barcos al Mapa");
        setContentPane(this.jPIntroducirBarcos);

        this.jCBSelectBarco.addActionListener(l -> {
            System.out.println("hola");
        });

        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void createUIComponents() {
        this.jPBarcosIntroducidos = new JPanel(new BorderLayout());
        this.jPBarcosIntroducidos.setBorder(new LineBorder(Color.BLACK, 2));
        this.mapaPlayer1 = new Mapa();
        this.jPBarcosIntroducidos.add(this.mapaPlayer1);
    }

    public Mapa getMapaPlayer1() {
        return this.mapaPlayer1;
    }
}
