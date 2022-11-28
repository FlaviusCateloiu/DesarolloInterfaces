import javax.swing.*;
import java.awt.*;

public class CombateBarcos extends JFrame {
    private JPanel jPCombate;
    private JPanel jPInfoCombate;
    private JPanel jPMapaJugador;
    private JPanel jPMapaBot;
    private JButton jBSalirJuego;

    private Mapa mapaJugador;
    private Mapa mapaBot;

    public CombateBarcos(Mapa mapaJugador, Mapa mapaBot) {
        super("Jugar Undir la Flota");
        this.mapaJugador = mapaJugador;
        this.mapaBot = mapaBot;
        setContentPane(jPCombate);

        jBSalirJuego.addActionListener(a -> {
            this.dispose();
        });

        setSize(1300, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void createUIComponents() {
        this.jPMapaJugador = new JPanel(new BorderLayout());
        this.jPMapaBot = new JPanel(new BorderLayout());
        this.jPMapaJugador.add(mapaJugador);
        this.jPMapaBot.add(mapaBot);
    }
}
