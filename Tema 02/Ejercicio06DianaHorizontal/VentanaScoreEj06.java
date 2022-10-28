import javax.swing.*;
import java.awt.*;

public class VentanaScoreEj06 extends JDialog {
    private JLabel score;

    public VentanaScoreEj06(JFrame jFrame, int valor, int valorRandom) {
        super(jFrame, "Resultado de la diana");
        setLayout(null);

        score = new JLabel();
        score.setBounds(10, 10, 250, 20);
        if (valor == valorRandom) {
            score.setText("¡Enhorabuena, acertaste! " + valor);
            score.setForeground(Color.RED);
        } else if (valor < valorRandom || valor > valorRandom) {
            score.setText("Ha estado cerca, prueba otra vez " + valor);
            score.setForeground(new Color(0xFD7300));
        } else {
            score.setText("Ha estado lejos, prueba otra vez " + valor);
            score.setForeground(new Color(0x459635));
        }

        add(score);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(jFrame);
        setVisible(true);
        setSize(300, 100);
    }
}
