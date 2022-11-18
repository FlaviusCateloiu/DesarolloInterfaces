import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class IntroducirBarcos extends JFrame {
    private JPanel jPIntroducirBarcos;
    private JPanel jPDatos;
    private JComboBox comboBox1;
    private JPanel jPBarcosIntroducidos;

    public IntroducirBarcos() {
        super("Introducir Barcos al Mapa");
        setContentPane(jPIntroducirBarcos);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void createUIComponents() {
        jPBarcosIntroducidos = new JPanel(new BorderLayout());
        jPBarcosIntroducidos.setBorder(new LineBorder(Color.BLACK, 2));
        jPBarcosIntroducidos.add(new Mapa());
    }
}
