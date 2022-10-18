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
    private JLabel numPersona;
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
        this.numPersona = new JLabel("");
        this.primeroB = new JButton("<<Primero");
        this.anteriorB = new JButton("<Anterior");
        this.siguienteB = new JButton("Siguiente>");
        this.ultimoB = new JButton("Ultimo>>");
        this.volverB = new JButton("Volver");

        posicionBotones();
        mostrarPersona();

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
        add(numPersona);
        add(siguienteB);
        add(ultimoB);
        add(volverB);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setLocationRelativeTo(null);
        setSize(500, 250);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.primeroB.addActionListener(e -> {
            positionLista = 0;
            posicionBotones();
            mostrarPersona();
        });

        this.anteriorB.addActionListener(e -> {
            positionLista--;
            posicionBotones();
            mostrarPersona();
        });

        this.siguienteB.addActionListener(e -> {
            positionLista++;
            posicionBotones();
            mostrarPersona();
        });

        this.ultimoB.addActionListener(e -> {
            positionLista = listaPersonas.size() - 1;
            posicionBotones();
            mostrarPersona();
        });

        this.volverB.addActionListener(e -> {
            this.dispose();
        });
    }

    public void posicionBotones() {
        primeroB.setEnabled(false);
        anteriorB.setEnabled(false);
        siguienteB.setEnabled(false);
        ultimoB.setEnabled(false);
        numPersona.setText((positionLista + 1) + "/" + listaPersonas.size());

        if (positionLista > 0) {
            primeroB.setEnabled(true);
            anteriorB.setEnabled(true);
            numPersona.setText((positionLista + 1) + "/" + listaPersonas.size());
        }
        if (positionLista < listaPersonas.size() - 1) {
            siguienteB.setEnabled(true);
            ultimoB.setEnabled(true);
            numPersona.setText((positionLista + 1) + "/" + listaPersonas.size());
        }
    }

    public void mostrarPersona() {
        nomPersTF = new JTextField(listaPersonas.get(positionLista).getNombre(), 10);
        emailPersTF = new JTextField(listaPersonas.get(positionLista).getEmail(), 20);
        fechaNacTF = new JTextField(listaPersonas.get(positionLista).getAnyoNacimiento().toString(), 20);
    }
}
