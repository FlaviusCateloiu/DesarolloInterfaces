import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mapa extends JPanel {

    private final int NUM_ROWS = 10;
    private final int NUM_COLS = 10;

    public Mapa() {
        super();
        setLayout(new GridLayout(NUM_ROWS, NUM_COLS, 0, 0));
        setSize(new Dimension(500, 500));
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                Barco label = new Barco();
                label.setBorder(new LineBorder(Color.BLACK));
                label.setOpaque(true);
                label.setBackground(new Color(136,215,144));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                add(label);
                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        label.seleccionarBarco();
                        label.setBackground(Color.RED);
                    }
                });
            }
        }
    }
}
