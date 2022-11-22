import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class IntroducirBarcos extends JFrame {

    private List<Barco> barcos;

    private Celda[][] celdas;
    private Mapa mapaPlayer1;
    private JPanel jPIntroducirBarcos;
    private JPanel jPDatos;
    private JComboBox jCBSelectBarco;
    private JPanel jPBarcosIntroducidos;

    public IntroducirBarcos() {
        super("Introducir Barcos al Mapa");
        this.barcos = new ArrayList<>();
        crearListaBarcos();
        setContentPane(this.jPIntroducirBarcos);

        jPBarcosIntroducidos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() / 60;
                int y = e.getY() / 60;

                for (int i = 0; i < celdas.length; i++) {
                    for (int j = 0; j < celdas[i].length; j++) {
                        if (i == x && j == y) {
                            celdas[j][i].setBackground(Color.RED);
                        }
                    }
                }
            }
        });

        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void createUIComponents() {
        this.jPBarcosIntroducidos = new JPanel(new BorderLayout());
        this.mapaPlayer1 = new Mapa();
        this.celdas = this.mapaPlayer1.getCeldas();
        this.jPBarcosIntroducidos.add(this.mapaPlayer1);
    }

    public Mapa getMapaPlayer1() {
        return this.mapaPlayer1;
    }

    private void crearListaBarcos() {
        this.barcos.add(new Barco("Aircraft", 5));
        this.barcos.add(new Barco("Battleship", 4));
        this.barcos.add(new Barco("Submarine", 3));
        this.barcos.add(new Barco("Cruiser", 3));
        this.barcos.add(new Barco("Destroyer", 2));
    }
}
