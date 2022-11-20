import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Mapa extends JPanel {
    public Mapa() {
        super();
        setLayout(new GridLayout(11, 11));
        for (int i = 0; i < 121; i++) {
            JLabel label = new JLabel("");
            label.setBorder(new LineBorder(Color.BLACK));
            add(label);
        }
    }
}
