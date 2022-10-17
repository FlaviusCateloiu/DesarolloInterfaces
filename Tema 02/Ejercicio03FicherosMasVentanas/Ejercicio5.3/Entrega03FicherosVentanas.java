import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class Entrega03FicherosVentanas {

    private JButton nuevaPersonaPrincipal;
    private JButton mostrarTodosPrincipal;
    private JButton buscarPersonaPrincipal;

    public Entrega03FicherosVentanas(ArrayList<Persona> listaPersonas) {
        JFrame ventanaPrincipal = new JFrame("Ventana Principal");
        this.nuevaPersonaPrincipal = new JButton("Nueva Persona");
        this.mostrarTodosPrincipal = new JButton("Mostrar Todos");
        this.buscarPersonaPrincipal = new JButton("Buscar Persona");


        // Ventana principal.
        ventanaPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setSize(500, 100);
        ventanaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.add(this.nuevaPersonaPrincipal);

        this.nuevaPersonaPrincipal.addActionListener(e -> {
            VentanaNuevaPersona ventanaNuevaPersona = new VentanaNuevaPersona("Ventana nueva persona", listaPersonas);
        });
        ventanaPrincipal.add(this.mostrarTodosPrincipal);
        this.mostrarTodosPrincipal.addActionListener(e -> {
            if (listaPersonas.size() == 0) {
                JOptionPane.showMessageDialog(null, "No hay personas en la agenda tienes que crear una.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                VentanaMostrarTodos ventanaMostrarTodos = new VentanaMostrarTodos("Ventana mostrar todos", listaPersonas);
            }
        });
        ventanaPrincipal.add(this.buscarPersonaPrincipal);
        this.buscarPersonaPrincipal.addActionListener(e -> {
            if (listaPersonas.size() == 0) {
                JOptionPane.showMessageDialog(null, "No hay personas en la agenda tienes que crear una.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                VentanaBuscarPersona ventanaBuscarPersona = new VentanaBuscarPersona("Ventana buscar persona", listaPersonas);
            }
        });
        ventanaPrincipal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                guardarPersonas(listaPersonas);
                super.windowClosing(e);
            }
        });
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        cargarPersonas(listaPersonas);
        Entrega03FicherosVentanas ventanaPrincipal = new Entrega03FicherosVentanas(listaPersonas);
    }

    public static void guardarPersonas(ArrayList<Persona> listaPersonas) {
        Path rutaArchivo = Path.of("Tema 02/Ejercicio03FicherosMasVentanas/Ejercicio5.3/personas.dat");
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo.toFile());
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Persona pers : listaPersonas) {
                oos.writeObject(pers);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido introducir a las personas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void cargarPersonas(ArrayList<Persona> listaPersonas) {
        Path rutaArchivo = Path.of("Tema 02/Ejercicio03FicherosMasVentanas/Ejercicio5.3/personas.dat");
        Persona pers;
        try (FileInputStream fis = new FileInputStream(rutaArchivo.toFile());
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (fis.available() > 0) {
                pers = (Persona) ois.readObject();
                listaPersonas.add(pers);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se a podido cargar el archivo con las personas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Persona buscarPersona(String nombrePersonaBuscar, ArrayList<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombrePersonaBuscar)) {
                return persona;
            }
        }

        return null;
    }

    public static void borrarPersona(ArrayList<Persona> listaPersonas, String nombreBorrar) {
        listaPersonas.removeIf(p -> p.getNombre().equalsIgnoreCase(nombreBorrar));
    }
}
