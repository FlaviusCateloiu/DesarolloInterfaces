import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Ejercicio02_4 {

    private JLabel explainProgramJLabel;
    private JLabel celsiusJLabel;
    private JTextField celsiusJTextField;
    private JLabel farenheitJLabel;
    private JTextField farenheitJTextField;
    private JButton convertir;

    public Ejercicio02_4() {
        JFrame windowsExplain = new JFrame("Celsius to Farenheit");
        windowsExplain.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        explainProgramJLabel = new JLabel("Este programa es para calcular Celsius a Farenheit y viceversa.", SwingConstants.CENTER);
        celsiusJLabel = new JLabel("Celsius:");
        celsiusJTextField = new JTextField("00.00");
        farenheitJLabel = new JLabel("Farenheit:");
        farenheitJTextField = new JTextField("00.00");
        convertir = new JButton("Convertir");
        convertir.addActionListener(new CalcularFarenheit(celsiusJTextField, farenheitJTextField));
        windowsExplain.add(explainProgramJLabel);
        windowsExplain.add(celsiusJLabel);
        windowsExplain.add(celsiusJTextField);
        windowsExplain.add(farenheitJLabel);
        windowsExplain.add(farenheitJTextField);
        windowsExplain.add(convertir);
        windowsExplain.setVisible(true);
        windowsExplain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windowsExplain.setLocationRelativeTo(null);
        windowsExplain.setSize(400, 300);
    }

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        float celsius, farenheit;
        System.out.print("Introduce grados celsius: ");
        celsius = sc.nextFloat();
        farenheit = (celsius * 1.8f) + 32f;
        System.out.println("Resultado en Farenheit: " + farenheit + "ºF"); */
        Ejercicio02_4 windowExplain = new Ejercicio02_4();
    }
}

