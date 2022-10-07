import javax.swing.*;
import java.util.Scanner;

public class Ejercicio02_2 extends JFrame {
    private JButton boton;

    public Ejercicio02_2(String titulo, String nomBoton) {
        super(titulo);
        boton = new JButton(nomBoton);
        add(boton);
        setSize(600, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, nomBoton;
        Ejercicio02_2 ventana = new Ejercicio02_2("Hola", "Adiós");

        System.out.print("Introduce un nuevo titulo a la ventana: ");
        titulo = sc.nextLine();

        System.out.print("Introduce el nuevo nombre del boton: ");
        nomBoton = sc.nextLine();

        ventana.dispose();
        Ejercicio02_2 ventanaNueva = new Ejercicio02_2(titulo, nomBoton);
    }
}
