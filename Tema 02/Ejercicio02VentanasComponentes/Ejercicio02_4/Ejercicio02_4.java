import javax.swing.*;
import java.util.Scanner;

public class Ejercicio02_4 {

    private JLabel textExplainProgram;

    public Ejercicio02_4() {
        JFrame windowsExplain = new JFrame("Celsius to Farenheit");
        textExplainProgram = new JLabel("Este programa es para calcular Celsius a Farenheit y viceversa.");
        windowsExplain.add(textExplainProgram);
        windowsExplain.setVisible(true);
        windowsExplain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowsExplain.setLocationRelativeTo(null);
        windowsExplain.setSize(600, 300);
    }

    public static void main(String[] args) {
        Ejercicio02_4 windowExplain = new Ejercicio02_4();
        Scanner sc = new Scanner(System.in);
        float celsius, farenheit;
        System.out.print("Introduce grados celsius: ");
        celsius = sc.nextFloat();

        System.out.println("Resultado en Farenheit: " + ((celsius * 1.8) + 32) + "ºF");
    }
}
