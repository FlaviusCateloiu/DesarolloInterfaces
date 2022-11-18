import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Mapa extends JPanel {

    private List<JLabel> listaLabels = new ArrayList<>();
    public Mapa() {
        super();
        setLayout(new GridLayout(11, 11));
        setSize(300, 300);
        for (int i = 0; i < 121; i++) {
            JLabel label = new JLabel("");
            label.setBorder(new LineBorder(Color.BLACK));
            listaLabels.add(label);
            add(label);
        }
    }

    public List<JLabel> getListaLabels() {
        return listaLabels;
    }

    public void setListaLabels(List<JLabel> listaLabels) {
        this.listaLabels = listaLabels;
    }
}
