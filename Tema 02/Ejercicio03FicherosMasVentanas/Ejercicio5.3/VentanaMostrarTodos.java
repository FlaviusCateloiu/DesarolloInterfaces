import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaMostrarTodos extends JFrame {
    private int positionLista = 0;
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
        this.emailPersL = new JLabel("Email: ");
        this.fechaNacL = new JLabel("Fecha Nacimiento: ");
        this.primeroB = new JButton("<<Primero");
        this.anteriorB = new JButton("<Anterior");
        this.siguienteB = new JButton("Siguiente>");
        this.ultimoB = new JButton("Ultimo>>");
        this.volverB = new JButton("Volver");


        this.nomPersTF = new JTextField(listaPersonas.get(positionLista).getNombre(), 10);
        this.emailPersTF = new JTextField(listaPersonas.get(positionLista).getEmail(), 20);
        this.fechaNacTF = new JTextField(listaPersonas.get(positionLista).getAnyoNacimiento().toString(), 20);

        this.nomPersTF.setEditable(false);
        this.emailPersTF.setEditable(false);
        this.fechaNacTF.setEditable(false);

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
