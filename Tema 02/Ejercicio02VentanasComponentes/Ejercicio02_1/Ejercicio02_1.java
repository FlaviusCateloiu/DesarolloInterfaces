import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02_1 extends JFrame {
    public Ejercicio02_1(String titulo, Color fondo) {
        super(titulo);
        getContentPane().setBackground(fondo);
        setSize((int) (Math.random() * 500 + 100), (int) (Math.random() * 500 + 100));
        setVisible(true);
        setLocation((int) (Math.random() * 1080 + 1), (int) (Math.random() * 1920 + 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Color fondo;
        int numeroVentanas;

        do {
            System.out.print("Introduce el numero de ventanas que se van a generar: ");
            numeroVentanas = sc.nextInt();

            if (numeroVentanas < 0) {
                System.err.println("Error, tienes que introducir un numero positivo.");
            }
        } while (numeroVentanas < 0);

        for (int i = 0; i < numeroVentanas; i++) {
            fondo = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            new Ejercicio02_1("Ventana " + (i + 1), fondo);
        }
    }
}
