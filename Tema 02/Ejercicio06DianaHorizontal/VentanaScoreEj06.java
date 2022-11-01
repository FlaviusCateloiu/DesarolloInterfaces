import javax.swing.*;
import java.awt.*;

public class VentanaScoreEj06 extends JDialog {
    private JLabel score;
    private JButton volver;

    public VentanaScoreEj06(JFrame jFrame) {
        super(jFrame, "Acerca De");
        setLayout(null);

        score = new JLabel();
        score.setBounds(10, 10, 2000, 20);
        score.setText("Contiene cuatro JButton Tres para los diferentes niveles y uno para volver a jugar, un JSlider " +
                "que es valor para ver si aciertas en la clase principal y despues en la clase del JDialog contiene un " +
                "JButton para volver y un JLabel mostrar el contenido.");

        volver = new JButton("Volver");
        volver.setBounds(1350, 100, 80, 30);
        add(volver);
        add(score);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(jFrame);
        setVisible(true);
        setSize(1500, 200);

        volver.addActionListener(e -> {
            this.dispose();
        });
    }

    public VentanaScoreEj06(JFrame jFrame, int valor, int valorRandom) {
        super(jFrame, "Resultado de la diana");
        setLayout(null);

        score = new JLabel();
        score.setBounds(10, 10, 250, 20);
        if (valor == valorRandom) {
            score.setText("¡Enhorabuena, acertaste! " + valor);
            score.setForeground(Color.RED);
        } else {
            if (valor >= (valorRandom - 10) && valor < valorRandom) {
                score.setText("Ha estado cerca, prueba otra vez " + valor);
                score.setForeground(new Color(0xFD7300));
            } else {
                if (valor <= (valorRandom + 10) && valor > valorRandom) {
                    score.setText("Ha estado cerca, prueba otra vez " + valor);
                    score.setForeground(new Color(0xFD7300));
                } else {
                    score.setText("Ha estado lejos, prueba otra vez " + valor);
                    score.setForeground(new Color(0x459635));
                }
            }
        }

        volver = new JButton("Volver");
        volver.setBounds(150, 100, 80, 30);
        add(volver);
        add(score);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(jFrame);
        setVisible(true);
        setSize(300, 200);

        volver.addActionListener(e -> {
            this.dispose();
        });
    }
}
