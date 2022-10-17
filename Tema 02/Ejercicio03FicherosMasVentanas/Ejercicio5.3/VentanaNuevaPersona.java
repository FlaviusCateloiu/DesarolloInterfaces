import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class VentanaNuevaPersona extends JFrame {
    private ArrayList<Persona> listaPersonas;
    private JLabel nomPersLab;
    private JTextField nomPersTF;
    private JLabel nomPersErrorL;
    private JLabel emailPersL;
    private JTextField emailPersTF;
    private JLabel emailPersErrorL;
    private JLabel fechaNacL;
    private JTextField fechaNacTF;
    private JLabel fechaPersErrorL;
    private JButton guardarB;
    private JButton volverB;
    public VentanaNuevaPersona(String titulo, ArrayList<Persona> listaPersonas) {
        super(titulo);
        this.listaPersonas = listaPersonas;
        this.nomPersLab = new JLabel("Nombre: ");
        this.nomPersTF = new JTextField("", 10);
        this.nomPersErrorL = new JLabel("");
        this.emailPersL = new JLabel("Email: ");
        this.emailPersTF = new JTextField("", 20);
        this.emailPersErrorL = new JLabel("");
        this.fechaNacL = new JLabel("Fecha Nacimiento: ");
        this.fechaNacTF = new JTextField("", 10);
        this.fechaPersErrorL = new JLabel("");
        this.guardarB = new JButton("Guardar");
        this.volverB = new JButton("Volver");

        add(nomPersLab);
        add(nomPersTF);
        add(nomPersErrorL);
        add(emailPersL);
        add(emailPersTF);
        add(emailPersErrorL);
        add(fechaNacL);
        add(fechaNacTF);
        add(fechaPersErrorL);
        add(guardarB);
        add(volverB);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setLocationRelativeTo(null);
        setSize(500, 250);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.volverB.addActionListener(e -> {
            this.dispose();
        });

        this.guardarB.addActionListener(e -> {
            boolean ok = true;
            String nombre = "", email = "", fecha = "";
            Date fechaNAc = null;
            Persona pers;

            if (this.nomPersTF.getText().isEmpty()) {
                ok = false;
                this.nomPersErrorL.setText("Tienes que introducir algo en el nombre.");
                this.nomPersErrorL.setForeground(Color.RED);
            } else {
                this.nomPersErrorL.setText("");
                nombre = nomPersTF.getText();
            }
            if (this.emailPersTF.getText().isEmpty()) {
                ok = false;
                this.emailPersErrorL.setText("Tienes que introducir algo en el email.");
                this.emailPersErrorL.setForeground(Color.RED);
            } else {
                this.emailPersErrorL.setText("");
                email = emailPersTF.getText();
            }
            if (this.fechaNacTF.getText().isEmpty()) {
                ok = false;
                this.fechaPersErrorL.setText("Tienes que introducir algo en el fecha.");
                this.fechaPersErrorL.setForeground(Color.RED);
            } else {
                this.fechaPersErrorL.setText("");
                fecha = fechaNacTF.getText();
                try {
                    fechaNAc = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
                } catch (Exception ex) {
                    ok = false;
                    this.fechaPersErrorL.setText("Formato de la fecha incorrecto tiene que ser dd/MM/yyyy");
                    this.fechaPersErrorL.setForeground(Color.RED);
                    System.out.println();
                }
            }
            if (ok) {
                Entrega03FicherosVentanas.borrarPersona(listaPersonas, nombre);
                pers = new Persona(nombre, email, fechaNAc);
                listaPersonas.add(pers);
                Entrega03FicherosVentanas.guardarPersonas(listaPersonas);
                JOptionPane.showMessageDialog(null, "Se a introducido a la persona a la agenda con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
