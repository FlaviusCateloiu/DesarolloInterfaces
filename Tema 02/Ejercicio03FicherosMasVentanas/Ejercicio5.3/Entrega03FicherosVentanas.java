import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class Entrega03FicherosVentanas {

    private JButton nuevaPersonaPrincipal;
    private JButton mostrarTodosPrincipal;
    private JButton buscarPersonaPrincipal;

    public Entrega03FicherosVentanas(ArrayList<Persona> listaPersonas) {
        JFrame ventanaPrincipal = new JFrame("Ventana Principal");
        JFrame ventanaNuevaPersona = new JFrame("Ventana nueva persona");
        JFrame ventanaMostrarTodos = new JFrame("Ventana mostrar todos");
        JFrame ventanaBuscarPersona = new JFrame("Ventana buscar persona");
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
            ventanaNuevaPersona.setVisible(true);
        });
        ventanaPrincipal.add(this.mostrarTodosPrincipal);
        this.mostrarTodosPrincipal.addActionListener(e -> {
            ventanaMostrarTodos.setVisible(true);
        });
        ventanaPrincipal.add(this.buscarPersonaPrincipal);
        this.buscarPersonaPrincipal.addActionListener(e -> {
            ventanaBuscarPersona.setVisible(true);
        });
        if (listaPersonas.size() == 0) {
            this.mostrarTodosPrincipal.setEnabled(false);
            this.buscarPersonaPrincipal.setEnabled(false);
        }

        //Ventana Nueva Persona.
        ventanaNuevaPersona.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ventanaNuevaPersona.setLocationRelativeTo(null);
        ventanaNuevaPersona.setSize(500, 100);
        ventanaNuevaPersona.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Ventana Mostrar Todos.
        ventanaMostrarTodos.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ventanaMostrarTodos.setLocationRelativeTo(null);
        ventanaMostrarTodos.setSize(500, 100);
        ventanaMostrarTodos.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Ventana Buscar Persona.
        ventanaBuscarPersona.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ventanaBuscarPersona.setLocationRelativeTo(null);
        ventanaBuscarPersona.setSize(500, 100);
        ventanaBuscarPersona.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        cargarPersonas(listaPersonas);
        Entrega03FicherosVentanas ventanaPrincipal = new Entrega03FicherosVentanas(listaPersonas);
    }

    private static void guardarPersonas(ArrayList<Persona> listaPersonas) {
        Path rutaArchivo = Path.of("Tema 02/Ejercicio03FicherosMasVentanas/EjercicVentana Principalio5.3/personas.dat");
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo.toFile());
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Persona pers : listaPersonas) {
                oos.writeObject(pers);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido introducir a las personas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void cargarPersonas(ArrayList<Persona> listaPersonas) {
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

    private static Persona buscarPersona(String nombrePersonaBuscar, ArrayList<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombrePersonaBuscar)) {
                return persona;
            }
        }

        return null;
    }

    private static void borrarPersona(ArrayList<Persona> listaPersonas, String nombreBorrar) {
        listaPersonas.removeIf(p -> p.getNombre().equalsIgnoreCase(nombreBorrar));
    }
}
