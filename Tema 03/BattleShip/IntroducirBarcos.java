import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class IntroducirBarcos extends JFrame {

    private List<Barco> barcos;
    private Mapa mapaPlayer1;
    private JPanel jPIntroducirBarcos;
    private JPanel jPDatos;
    private JComboBox jCBSelectBarco;
    private JPanel jPBarcosIntroducidos;

    public IntroducirBarcos() {
        super("Introducir Barcos al Mapa");
        crearListaBarcos();
        setContentPane(this.jPIntroducirBarcos);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void createUIComponents() {
        crearListaBarcos();
        this.jCBSelectBarco = new JComboBox();
        this.jCBSelectBarco.addItem(this.barcos.get(0).getNombre());
        this.jCBSelectBarco.addItem(this.barcos.get(1).getNombre());
        this.jCBSelectBarco.addItem(this.barcos.get(2).getNombre());
        this.jCBSelectBarco.addItem(this.barcos.get(3).getNombre());
        this.jCBSelectBarco.addItem(this.barcos.get(4).getNombre());

        this.jPBarcosIntroducidos = new JPanel(new BorderLayout());
        this.jPBarcosIntroducidos.setBorder(new LineBorder(Color.BLACK, 2));
        this.mapaPlayer1 = new Mapa(this.barcos, jCBSelectBarco);
        this.jPBarcosIntroducidos.add(this.mapaPlayer1);
    }

    public Mapa getMapaPlayer1() {
        return this.mapaPlayer1;
    }

    private void crearListaBarcos() {
        this.barcos = new ArrayList<>();
        this.barcos.add(new Barco("Aircraft", 5));
        this.barcos.add(new Barco("Battleship", 4));
        this.barcos.add(new Barco("Submarine", 3));
        this.barcos.add(new Barco("Cruiser", 3));
        this.barcos.add(new Barco("Destroyer", 2));
    }
}
