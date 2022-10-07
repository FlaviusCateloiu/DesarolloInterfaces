import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EscuchadorVentanaAdaptado extends WindowAdapter {
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Hola he vuelto.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Me he escondido.");
    }
}
