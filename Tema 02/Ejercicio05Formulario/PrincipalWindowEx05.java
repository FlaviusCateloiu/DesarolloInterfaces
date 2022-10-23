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
        JLNombre = new JLabel("*Nombre:");
        JLNombre.setBounds(30, 30, 100, 20);
        add(JLNombre);
        JTFNombre = new JTextField("");
        JTFNombre.setBounds(90, 30, 150, 20);
        add(JTFNombre);
        JLNombreError = new JLabel("Error tienes que introducir el nombre de forma correcta.");
        JLNombreError.setForeground(Color.RED);
        JLNombreError.setBounds(30, 50, 340, 20);
        add(JLNombreError);

        JLApellidos = new JLabel("*Apellidos:");
        JLApellidos.setBounds(380, 30, 100, 20);
        add(JLApellidos);
        JTFApellidos = new JTextField("");
        JTFApellidos.setBounds(445, 30, 200, 20);
        add(JTFApellidos);
        JLApellidosError = new JLabel("Error tienes que introducir los apellidos de forma correcta.");
        JLApellidosError.setForeground(Color.RED);
        JLApellidosError.setBounds(380, 50, 400, 20);
        add(JLApellidosError);

        JLDni = new JLabel("*DNI:");
        JLDni.setBounds(750, 30, 50, 20);
        add(JLDni);
        JTFDni = new JTextField("");
        JTFDni.setBounds(785, 30, 80, 20);
        add(JTFDni);
        JLDniError = new JLabel("Error el tienes que introducir el dni con formato correcto.");
        JLDniError.setForeground(Color.RED);
        JLDniError.setBounds(750, 50, 400, 20);
        add(JLDniError);

        JLTelefono = new JLabel("*Telefono:");
        JLTelefono.setBounds(30, 80, 100, 20);
        add(JLTelefono);
        JTFTelefono = new JTextField("");
        JTFTelefono.setBounds(90, 80, 80, 20);
        add(JTFTelefono);
        JLTelefonoError = new JLabel("Error el telefono es maximo de 9 numeros.");
        JLTelefonoError.setForeground(Color.RED);
        JLTelefonoError.setBounds(30, 100, 250, 20);
        add(JLTelefonoError);

        JLCalle = new JLabel("*Calle:");
        JLCalle.setBounds(300, 80, 100, 20);
        add(JLCalle);
        JTFCalle = new JTextField("");
        JTFCalle.setBounds(340, 80, 200, 20);
        add(JTFCalle);
        JLCalleError = new JLabel("Error tienes que introducir la calle.");
        JLCalleError.setForeground(Color.RED);
        JLCalleError.setBounds(300, 100, 250, 20);
        add(JLCalleError);

        JLPortal = new JLabel("*Numero Portal:");
        JLPortal.setBounds(570, 80, 100, 20);
        add(JLPortal);
        JTFPortal = new JTextField("");
        JTFPortal.setBounds(665, 80, 35, 20);
        add(JTFPortal);
        JLPortalError = new JLabel("Error tienes que introducir el portal.");
        JLPortalError.setForeground(Color.RED);
        JLPortalError.setBounds(570, 100, 250, 20);
        add(JLPortalError);

        JLPiso = new JLabel("Numero Piso:");
        JLPiso.setBounds(790, 80, 100, 20);
        add(JLPiso);
        JTFPiso = new JTextField("");
        JTFPiso.setBounds(875, 80, 30, 20);
        add(JTFPiso);

        JLPuerta = new JLabel("Puerta:");
        JLPuerta.setBounds(930, 80, 100, 20);
        add(JLPuerta);
        JTFPuerta = new JTextField("");
        JTFPuerta.setBounds(980, 80, 30, 20);
        add(JTFPuerta);

        JLCodigoPostal = new JLabel("*Codigo Postal:");
        JLCodigoPostal.setBounds(30, 130, 100, 20);
        add(JLCodigoPostal);
        JTFCodigoPostal = new JTextField("");
        JTFCodigoPostal.setBounds(120, 130, 50, 20);
        add(JTFCodigoPostal);
        JLCodigoPostalError = new JLabel("Error tienes que introducir el portal.");
        JLCodigoPostalError.setForeground(Color.RED);
        JLCodigoPostalError.setBounds(30, 150, 250, 20);
        add(JLCodigoPostalError);

        setLayout(null);
        setResizable(false);
        setSize(1120, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        PrincipalWindowEx05 ventanaPrincipal = new PrincipalWindowEx05();
    }
}
