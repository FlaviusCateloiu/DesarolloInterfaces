import javax.swing.*;
import java.awt.*;

public class PrincipalWindowEx05 extends JFrame {

    private JLabel JLNombre;
    private JTextField JTFNombre;
    private JLabel JLNombreError;
    private JLabel JLApellidos;
    private JTextField JTFApellidos;
    private JLabel JLApellidosError;
    private JLabel JLDni;
    private JTextField JTFDni;
    private JLabel JLDniError;
    private JLabel JLTelefono;
    private JTextField JTFTelefono;
    private JLabel JLTelefonoError;
    private JLabel JLCalle;
    private JTextField JTFCalle;
    private JLabel JLCalleError;
    private JLabel JLPortal;
    private JTextField JTFPortal;
    private JLabel JLPortalError;
    private JLabel JLPiso;
    private JTextField JTFPiso;
    private JLabel JLPuerta;
    private JTextField JTFPuerta;
    private JLabel JLCodigoPostal;
    private JTextField JTFCodigoPostal;
    private JLabel JLCodigoPostalError;
    private JLabel JLCiudad;
    private JTextField JTFCiudad;
    private JLabel JLCiudadError;
    private JLabel JLNumFederador;
    private JTextField JTFNumFederador;
    private JLabel JLNumFederadorError;
    private JLabel JLSexo;
    private JCheckBox JCBSexoM;
    private JCheckBox JCBSexoF;

    public PrincipalWindowEx05() {
        super("Formulario");
        JLNombre = new JLabel("Nombre:");
        JLNombre.setBounds(30, 30, 100, 20);
        add(JLNombre);
        JTFNombre = new JTextField("");
        JTFNombre.setBounds(90, 30, 150, 20);
        add(JTFNombre);
        JLNombreError = new JLabel("Error tienes que introducir el nombre de forma correcta.");
        JLNombreError.setForeground(Color.RED);
        JLNombreError.setBounds(30, 50, 340, 20);
        add(JLNombreError);

        JLApellidos = new JLabel("Apellidos:");
        JLApellidos.setBounds(380, 30, 100, 20);
        add(JLApellidos);
        JTFApellidos = new JTextField("");
        JTFApellidos.setBounds(445, 30, 200, 20);
        add(JTFApellidos);
        JLApellidosError = new JLabel("Error tienes que introducir los apellidos de forma correcta.");
        JLApellidosError.setForeground(Color.RED);
        JLApellidosError.setBounds(380, 50, 400, 20);
        add(JLApellidosError);

        JLDni = new JLabel("DNI:");
        JLDni.setBounds(750, 30, 50, 20);
        add(JLDni);
        JTFDni = new JTextField("");
        JTFDni.setBounds(785, 30, 100, 20);
        add(JTFDni);
        JLDniError = new JLabel("Error el tienes que introducir el dni con formato correcto.");
        JLDniError.setForeground(Color.RED);
        JLDniError.setBounds(750, 50, 400, 20);
        add(JLDniError);

        JLTelefono = new JLabel("Telefono:");
        JLTelefono.setBounds(30, 90, 100, 20);
        add(JLTelefono);
        JTFTelefono = new JTextField("");
        JTFTelefono.setBounds(90, 90, 100, 20);
        add(JTFTelefono);

        setLayout(null);
        setResizable(false);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        PrincipalWindowEx05 ventanaPrincipal = new PrincipalWindowEx05();
    }
}
