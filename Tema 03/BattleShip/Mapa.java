import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Mapa extends JPanel {

    public Mapa() {
        super();
        setLayout(new GridLayout(11, 11));
        for (int i = 0; i < 121; i++) {
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

    public List<Component> getComponentes() {
        return this.getComponentes();
    }
}
