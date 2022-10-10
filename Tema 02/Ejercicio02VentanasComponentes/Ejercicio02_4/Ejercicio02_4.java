import javax.swing.*;
import java.util.Scanner;

public class Ejercicio02_4 extends JFrame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius, farenheit;
        System.out.print("Introduce grados celsius: ");
        celsius = sc.nextFloat();

        System.out.println("Resultado en Farenheit: " + ((celsius * 1.8) + 32) + " ºF");
    }
}
