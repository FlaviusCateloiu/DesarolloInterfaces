import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
        this.barcos = Barco.crearListaBarcos();
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

        jBComenzarPartida.addActionListener(a -> {
            boolean barcosColocados = true;

            for (Barco b : barcos) {
                if (!b.isIntroducido()) {
                    barcosColocados = false;
                }
            }

            if (barcosColocados) {
                Ordenador ordenador = new Ordenador();
                CombateBarcos combate = new CombateBarcos(this.mapaPlayer1, ordenador.crearMapa());
                setVisible(false);
                combate.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        dispose();
                    }
                });
            } else {
                JOptionPane.showMessageDialog(this, "Introduce todos los barcos para poder jugar contra la IA.", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void colocarBarco(int x, int y) {
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

    private void calcularPosBarco(Barco b, String nombreBarco, int x, int y) {
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
                            new Object[]{"Abajo", "Izquierda", "Arriba", "Derecha"},
                            "Abajo");
                    if (seleccion == 0) {
                        for (int i = y; i < b.getLongitud() + y; i++) {
                            if (!celdas[i][x].isSeleccionado()) {
                                celdas[i][x].setBackground(b.getColor());
                                celdas[i][x].setSeleccionado(true);
                                celdas[i][x].setBarco(b.getNombre());
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else if (seleccion == 1) {
                        for (int i = x; i > x - b.getLongitud(); i--) {
                            if (!celdas[y][i].isSeleccionado()) {
                                celdas[y][i].setBackground(b.getColor());
                                celdas[y][i].setSeleccionado(true);
                                celdas[y][i].setBarco(b.getNombre());
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else if (seleccion == 2) {
                        for (int i = y; i > y - b.getLongitud(); i--) {
                            if (!celdas[i][x].isSeleccionado()) {
                                celdas[i][x].setBackground(b.getColor());
                                celdas[i][x].setSeleccionado(true);
                                celdas[i][x].setBarco(b.getNombre());
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else {
                        for (int i = x; i < b.getLongitud() + x; i++) {
                            if (!celdas[y][i].isSeleccionado()) {
                                celdas[y][i].setBackground(b.getColor());
                                celdas[y][i].setSeleccionado(true);
                                celdas[y][i].setBarco(b.getNombre());
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    }
                    b.setIntroducido(true);
                } catch (ArrayIndexOutOfBoundsException e) {
                    jErrorSelecBarco.setText("Error te has salido del mapa introduce otra vez el barco.");
                    for (int i = 0; i < celdas.length; i++) {
                        for (int j = 0; j < celdas[i].length; j++) {
                            if (celdas[i][j].getBarco().equalsIgnoreCase(b.getNombre())) {
                                celdas[i][j].setBarco("");
                                celdas[i][j].setSeleccionado(false);
                                celdas[i][j].setBackground(new Color(136, 215, 144));
                            }
                        }
                    }
                }
            }
        }
    }
}
