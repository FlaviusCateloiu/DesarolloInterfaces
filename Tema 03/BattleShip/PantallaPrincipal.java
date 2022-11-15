import javax.swing.*;

public class PantallaPrincipal extends JFrame {
    private JButton bJugar;
    private JButton bSalir;
    private JLabel lTitulo;
    private JPanel pPrincipal;

    public PantallaPrincipal() {
        super("");
        setContentPane(pPrincipal);
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PantallaPrincipal pantalla = new PantallaPrincipal();
    }
}
