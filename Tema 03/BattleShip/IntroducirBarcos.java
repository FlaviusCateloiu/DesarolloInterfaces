import javax.swing.*;
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
    private JLabel jErrorSelecBarco;
    private JLabel jLInforBarco;
    private JButton jBComenzarPartida;

    public IntroducirBarcos() {
        super("Introducir Barcos al Mapa");
        this.barcos = new ArrayList<>();
        crearListaBarcos();
        setContentPane(this.jPIntroducirBarcos);

        jCBSelectBarco.addActionListener(a -> {
            for (Barco b : barcos) {
                switch (jCBSelectBarco.getSelectedItem().toString()) {
                    case "Aircraft":
                        if (b.getNombre().equalsIgnoreCase("Aircraft")) {
                            jLInforBarco.setText("El barco " + b.getNombre() + " tiene una longitud de " + b.getLongitud());
                        }
                        break;
                    case "Battleship":
                        if (b.getNombre().equalsIgnoreCase("Battleship")) {
                            jLInforBarco.setText("El barco " + b.getNombre() + " tiene una longitud de " + b.getLongitud());
                        }
                        break;
                    case "Submarine":
                        if (b.getNombre().equalsIgnoreCase("Submarine")) {
                            jLInforBarco.setText("El barco " + b.getNombre() + " tiene una longitud de " + b.getLongitud());
                        }
                        break;
                    case "Cruiser":
                        if (b.getNombre().equalsIgnoreCase("Cruiser")) {
                            jLInforBarco.setText("El barco " + b.getNombre() + " tiene una longitud de " + b.getLongitud());
                        }
                        break;
                    case "Destroyer":
                        if (b.getNombre().equalsIgnoreCase("Destroyer")) {
                            jLInforBarco.setText("El barco " + b.getNombre() + " tiene una longitud de " + b.getLongitud());
                        }
                        break;
                }
            }
        });

        jPBarcosIntroducidos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() / 60;
                int y = e.getY() / 60;

                for (int i = 0; i < celdas.length; i++) {
                    for (int j = 0; j < celdas[i].length; j++) {
                        if (i == x && j == y) {
                            colocarBarco(i, j);
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
        this.barcos.add(new Barco("Aircraft", 5, Color.BLUE));
        this.barcos.add(new Barco("Battleship", 4, Color.YELLOW));
        this.barcos.add(new Barco("Submarine", 3, Color.GREEN));
        this.barcos.add(new Barco("Cruiser", 3, Color.PINK));
        this.barcos.add(new Barco("Destroyer", 2, Color.ORANGE));
    }

    public void colocarBarco(int x, int y) {
        switch (jCBSelectBarco.getSelectedItem().toString()) {
            case "Aircraft":
                for (Barco b : barcos) {
                    calcularPosBarco(b, "Aircraft", x, y);
                }
                break;
            case "Battleship":
                for (Barco b : barcos) {
                    calcularPosBarco(b, "Battleship", x, y);
                }
                break;
            case "Submarine":
                for (Barco b : barcos) {
                    calcularPosBarco(b, "Submarine", x, y);
                }
                break;
            case "Cruiser":
                for (Barco b : barcos) {
                    calcularPosBarco(b, "Cruiser", x, y);
                }
                break;
            case "Destroyer":
                for (Barco b : barcos) {
                    calcularPosBarco(b, "Destroyer", x, y);
                }
                break;
        }
    }

    public void calcularPosBarco(Barco b, String nombreBarco, int x, int y) {
        if (b.getNombre().equalsIgnoreCase(nombreBarco)) {
            if (b.isIntroducido()) {
                jErrorSelecBarco.setText("Error este barco ya esta introducido.");
            } else {
                jErrorSelecBarco.setText("");
                try {
                    int seleccion = JOptionPane.showOptionDialog(
                            this,
                            "Seleccione opcion",
                            "Selector de opciones",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[] { "Abajo", "Izquierda", "Arriba", "Derecha"},
                            "Abajo");
                    if (seleccion == 0) {
                        for (int i = y; i < b.getLongitud() + y; i++) {
                            celdas[i][x].setBackground(b.getColor());
                            celdas[i][x].setSeleccionado(true);
                            celdas[i][x].setBarco(b.getNombre());
                        }
                    } else if (seleccion == 1) {
                        for (int i = x; i > x - b.getLongitud(); i--) {
                            celdas[y][i].setBackground(b.getColor());
                            celdas[y][i].setSeleccionado(true);
                            celdas[i][x].setBarco(b.getNombre());
                        }
                    } else if (seleccion == 2) {
                        for (int i = y; i > y - b.getLongitud(); i--) {
                            celdas[i][x].setBackground(b.getColor());
                            celdas[i][x].setSeleccionado(true);
                            celdas[i][x].setBarco(b.getNombre());
                        }
                    } else {
                        for (int i = x; i < b.getLongitud() + x; i++) {
                            celdas[y][i].setBackground(b.getColor());
                            celdas[y][i].setSeleccionado(true);
                            celdas[i][x].setBarco(b.getNombre());
                        }
                    }
                    b.setIntroducido(true);
                } catch(ArrayIndexOutOfBoundsException e) {
                    jErrorSelecBarco.setText("Error te has salido del mapa introduce otra vez el barco.");

                }
            }
        }
    }
}
