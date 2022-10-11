import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularFarenheit implements ActionListener {
    private JTextField celsius;
    private JTextField farenheit;

    public CalcularFarenheit(JTextField celsius, JTextField farenheit) {
        this.celsius = celsius;
        this.farenheit = farenheit;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float celsius, farenheit;
        try {
            celsius = Float.parseFloat(this.celsius.getText());
            farenheit = (celsius * 1.8f) + 32f;
            this.farenheit.setText(Float.toString(farenheit));
        } catch (Exception ex) {
            System.out.println("Error tienes que introducir un numero en celsius.");
        }
    }
}
