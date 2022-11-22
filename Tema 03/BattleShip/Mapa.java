import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Mapa extends JPanel {

    private Celda[][] celdas;
    private final int NUM_ROWS = 10;
    private final int NUM_COLS = 10;

    public Mapa() {
        setLayout(new GridLayout(NUM_ROWS, NUM_COLS, 0, 0));
        setSize(new Dimension(500, 500));
        celdas = new Celda[NUM_ROWS][NUM_COLS];
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                Celda label = new Celda();
                label.setBorder(new LineBorder(Color.BLACK));
                label.setOpaque(true);
                label.setBackground(new Color(136,215,144));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                celdas[i][j] = label;
                add(label);

                /*label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (!label.isSeleccionado()) {
                            label.seleccionarBarco();
                            label.setBackground(Color.RED);
                        } else {
                            label.setSeleccionado(false);
                            label.setBackground(new Color(136,215,144));
                        }
                    }
                });*/
            }
        }
    }

    public Celda[][] getCeldas() {
        return celdas;
    }
}
