import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Mapa extends JPanel {

    private final int NUM_ROWS = 10;
    private final int NUM_COLS = 10;

    public Mapa() {
        super();
        setLayout(new GridLayout(NUM_ROWS, NUM_COLS));
        for (int i = 0; i < (NUM_ROWS * NUM_COLS); i++) {
            JLabel label = new JLabel("");
            label.setBorder(new LineBorder(Color.BLACK));
            add(label);
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label.setText("Marcado");
                }
            });
        }
    }
}
