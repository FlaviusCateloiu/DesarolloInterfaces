import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaMostrarTodos extends JFrame {
    ArrayList<Persona> listaPersonas;
    private JLabel nomPersLab;
    private JTextField nomPersTF;
    private JLabel emailPersL;
    private JTextField emailPersTF;
    private JLabel fechaNacL;
    private JTextField fechaNacTF;
    private JButton primeroB;
    private JButton anteriorB;
    private JButton siguienteB;
    private JButton ultimoB;
    private JButton volverB;
    public VentanaMostrarTodos(String titulo, ArrayList<Persona> listaPersonas) {
        super(titulo);
        this.listaPersonas = listaPersonas;
        this.nomPersLab = new JLabel("Nombre: ");
        this.nomPersTF = new JTextField("", 10);
        this.emailPersL = new JLabel("Email: ");
        this.emailPersTF = new JTextField("", 20);
        this.fechaNacL = new JLabel("Fecha Nacimiento: ");
        this.fechaNacTF = new JTextField("", 10);
        this.primeroB = new JButton("<<Primero");
        this.anteriorB = new JButton("<Anterior");
        this.siguienteB = new JButton("Siguiente>");
        this.ultimoB = new JButton("Ultimo>>");
        this.volverB = new JButton("Volver");

        add(nomPersLab);
        add(nomPersTF);
        add(emailPersL);
        add(emailPersTF);
        add(fechaNacL);
        add(fechaNacTF);
        add(primeroB);
        add(anteriorB);
        add(siguienteB);
        add(ultimoB);
        add(volverB);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setLocationRelativeTo(null);
        setSize(500, 250);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.volverB.addActionListener(e -> {
            this.dispose();
        });
    }
}
