import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;

public class Ejercicio5_3 {

    private JButton nuevaPersona;
    private JButton mostrarTodos;
    private JButton buscarPersona;

    public Ejercicio5_3(ArrayList<Persona> listaPersonas) {
        JFrame ventanaPrincipal = new JFrame("Ventana Principal");
        this.nuevaPersona = new JButton("Nueva Persona");
        this.mostrarTodos = new JButton("Mostrar Todos");
        this.buscarPersona = new JButton("Buscar Persona");
        ventanaPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        ventanaPrincipal.add(this.nuevaPersona);
        ventanaPrincipal.add(this.mostrarTodos);
        ventanaPrincipal.add(this.buscarPersona);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setSize(500, 100);
        ventanaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        Date fecha = null;
        Persona pers;

        cargarPersonas(listaPersonas);
        Ejercicio5_3 ventanaPrincipal = new Ejercicio5_3(listaPersonas);
    }

    public static void guardarPersonas(ArrayList<Persona> listaPersonas) {
        Path rutaArchivo = Path.of("Tema 02/Ejercicio03FicherosMasVentanas/Ejercicio5.3/personas.dat");
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo.toFile());
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Persona pers : listaPersonas) {
                oos.writeObject(pers);
            }
        } catch (Exception e) {
            System.out.println("No se ha podido introducir a las personas.");
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
            System.out.println("No se a podido cargar el archivo con las personas.");
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
