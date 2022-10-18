import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaBuscarPersona extends JFrame {
    ArrayList<Persona> listaPersonas;
    private JLabel nomPersLab;
    private JTextField nomPersTF;
    private JLabel nomPersErrorL;
    private JLabel emailPersL;
    private JTextField emailPersTF;
    private JLabel fechaNacL;
    private JTextField fechaNacTF;
    private JButton buscarB;
    private JButton volverB;
    public VentanaBuscarPersona(String titulo, ArrayList<Persona> listaPersonas) {
        super(titulo);
        this.listaPersonas = listaPersonas;
        this.nomPersLab = new JLabel("Nombre: ");
        this.nomPersTF = new JTextField("", 10);
        this.nomPersErrorL = new JLabel("");
        this.emailPersL = new JLabel("Email: ");
        this.emailPersTF = new JTextField("", 20);
        this.emailPersTF.setEditable(false);
        this.fechaNacL = new JLabel("Fecha Nacimiento: ");
        this.fechaNacTF = new JTextField("", 20);
        this.fechaNacTF.setEditable(false);
        this.buscarB = new JButton("Buscar");
        this.volverB = new JButton("Volver");

        add(nomPersLab);
        add(nomPersTF);
        add(nomPersErrorL);
        add(emailPersL);
        add(emailPersTF);
        add(fechaNacL);
        add(fechaNacTF);
        add(buscarB);
        add(volverB);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setLocationRelativeTo(null);
        setSize(500, 250);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.buscarB.addActionListener(e -> {
            boolean personaEstaLista = true;

            if (nomPersTF.getText().isEmpty()) {
                nomPersErrorL.setText("Tienes que introducir un nombre para buscar a una persona.");
                nomPersErrorL.setForeground(Color.RED);
            } else{
                nomPersErrorL.setText("");
                for (Persona pers : listaPersonas) {
                    if (nomPersTF.getText().equals(pers.getNombre())) {
                        emailPersTF.setText(pers.getEmail());
                        fechaNacTF.setText(pers.getAnyoNacimiento().toString());
                    } else {
                        personaEstaLista = false;
                    }
                }
            }
            if (!personaEstaLista) {
                nomPersErrorL.setText("Error la persona que quieres introducir no esta.");
                nomPersErrorL.setForeground(Color.RED);
            }
        });

        this.volverB.addActionListener(e -> {
            this.dispose();
        });
    }
    public void mostrarPersona(int positionLista) {
        nomPersTF.setText(listaPersonas.get(positionLista).getNombre());
        emailPersTF.setText(listaPersonas.get(positionLista).getEmail());
        fechaNacTF.setText(listaPersonas.get(positionLista).getAnyoNacimiento().toString());
    }
}
