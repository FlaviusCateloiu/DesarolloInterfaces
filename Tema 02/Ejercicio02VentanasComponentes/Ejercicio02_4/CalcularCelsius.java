import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularCelsius implements ActionListener {
    private JTextField celsius;
    private JTextField farenheit;

    public CalcularCelsius(JTextField celsius, JTextField farenheit) {
        this.celsius = celsius;
        this.farenheit = farenheit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float celsius, farenheit;
        try {
            farenheit = Float.parseFloat(this.farenheit.getText());
            celsius = (farenheit - 32f) / 1.8f;
            this.celsius.setText(Float.toString(celsius));
        } catch (Exception ex) {
            System.out.println("Error tienes que introducir un numero en farenheit.");
        }
    }
}
