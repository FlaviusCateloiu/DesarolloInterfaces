import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class PrincipalWindowEx05 extends JFrame {

    private JLabel jLNombre;
    private JTextField jTFNombre;
    private JLabel jLNombreError;
    private JLabel jLApellidos;
    private JTextField jTFApellidos;
    private JLabel jLApellidosError;
    private JLabel jLDni;
    private JTextField jTFDni;
    private JLabel jLDniError;
    private JLabel jLTelefono;
    private JTextField jTFTelefono;
    private JLabel jLTelefonoError;
    private JLabel jLCalle;
    private JTextField jTFCalle;
    private JLabel jLCalleError;
    private JLabel jLPortal;
    private JTextField jTFPortal;
    private JLabel jLPortalError;
    private JLabel jLPiso;
    private JTextField jTFPiso;
    private JLabel jLPuerta;
    private JTextField jTFPuerta;
    private JLabel jLCodigoPostal;
    private JTextField jTFCodigoPostal;
    private JLabel jLCodigoPostalError;
    private JLabel jLCiudad;
    private JTextField jTFCiudad;
    private JLabel jLCiudadError;
    private JLabel jLNumFederador;
    private JTextField jTFNumFederador;
    private JLabel jLNumFederadorError;
    private JLabel jLSexo;
    private ButtonGroup bGSexo;
    private JRadioButton jRBSexoM;
    private JRadioButton jRBSexoF;
    private JLabel jLSexoError;
    private JLabel jLPassword;
    private JPasswordField jTFPassword;
    private JLabel jLPasswordError;
    private JLabel jLConfirmPassword;
    private JPasswordField jTFConfirmPassword;
    private JLabel jLConfirmPasswordError;
    private JComboBox jCBTipoComp;
    private JComboBox jCBTipoArm;
    private JCheckBox jCheckBCompIndiv;
    private JCheckBox jCheckBCompEquip;
    private JLabel jLErrorTipoComp;
    private JButton jButGuardar;
    private JButton jButSalir;

    public PrincipalWindowEx05() {
        super("Formulario");
        jLNombre = new JLabel("*Nombre:");
        jLNombre.setBounds(30, 30, 100, 20);
        add(jLNombre);
        jTFNombre = new JTextField("");
        jTFNombre.setBounds(100, 30, 150, 20);
        add(jTFNombre);
        jLNombreError = new JLabel("");
        jLNombreError.setForeground(Color.RED);
        jLNombreError.setBounds(30, 50, 340, 20);
        add(jLNombreError);

        jLApellidos = new JLabel("*Apellidos:");
        jLApellidos.setBounds(380, 30, 100, 20);
        add(jLApellidos);
        jTFApellidos = new JTextField("");
        jTFApellidos.setBounds(455, 30, 200, 20);
        add(jTFApellidos);
        jLApellidosError = new JLabel("");
        jLApellidosError.setForeground(Color.RED);
        jLApellidosError.setBounds(380, 50, 400, 20);
        add(jLApellidosError);

        jLDni = new JLabel("*DNI:");
        jLDni.setBounds(750, 30, 50, 20);
        add(jLDni);
        jTFDni = new JTextField("");
        jTFDni.setBounds(795, 30, 80, 20);
        add(jTFDni);
        jLDniError = new JLabel("");
        jLDniError.setForeground(Color.RED);
        jLDniError.setBounds(750, 50, 400, 20);
        add(jLDniError);

        jLTelefono = new JLabel("*Telefono:");
        jLTelefono.setBounds(30, 80, 100, 20);
        add(jLTelefono);
        jTFTelefono = new JTextField("");
        jTFTelefono.setBounds(100, 80, 80, 20);
        add(jTFTelefono);
        jLTelefonoError = new JLabel("");
        jLTelefonoError.setForeground(Color.RED);
        jLTelefonoError.setBounds(30, 100, 260, 20);
        add(jLTelefonoError);

        jLCalle = new JLabel("*Calle:");
        jLCalle.setBounds(300, 80, 100, 20);
        add(jLCalle);
        jTFCalle = new JTextField("");
        jTFCalle.setBounds(350, 80, 200, 20);
        add(jTFCalle);
        jLCalleError = new JLabel("");
        jLCalleError.setForeground(Color.RED);
        jLCalleError.setBounds(300, 100, 250, 20);
        add(jLCalleError);

        jLPortal = new JLabel("*Numero Portal:");
        jLPortal.setBounds(570, 80, 100, 20);
        add(jLPortal);
        jTFPortal = new JTextField("");
        jTFPortal.setBounds(675, 80, 35, 20);
        add(jTFPortal);
        jLPortalError = new JLabel("");
        jLPortalError.setForeground(Color.RED);
        jLPortalError.setBounds(570, 100, 250, 20);
        add(jLPortalError);

        jLPiso = new JLabel("Numero Piso:");
        jLPiso.setBounds(790, 80, 100, 20);
        add(jLPiso);
        jTFPiso = new JTextField("");
        jTFPiso.setBounds(885, 80, 30, 20);
        add(jTFPiso);

        jLPuerta = new JLabel("Puerta:");
        jLPuerta.setBounds(930, 80, 100, 20);
        add(jLPuerta);
        jTFPuerta = new JTextField("");
        jTFPuerta.setBounds(980, 80, 30, 20);
        add(jTFPuerta);

        jLCodigoPostal = new JLabel("*Codigo Postal:");
        jLCodigoPostal.setBounds(30, 130, 100, 20);
        add(jLCodigoPostal);
        jTFCodigoPostal = new JTextField("");
        jTFCodigoPostal.setBounds(130, 130, 50, 20);
        add(jTFCodigoPostal);
        jLCodigoPostalError = new JLabel("");
        jLCodigoPostalError.setForeground(Color.RED);
        jLCodigoPostalError.setBounds(30, 150, 250, 20);
        add(jLCodigoPostalError);

        jLCiudad = new JLabel("*Ciudad:");
        jLCiudad.setBounds(260, 130, 100, 20);
        add(jLCiudad);
        jTFCiudad = new JTextField("");
        jTFCiudad.setBounds(320, 130, 100, 20);
        add(jTFCiudad);
        jLCiudadError = new JLabel("");
        jLCiudadError.setForeground(Color.RED);
        jLCiudadError.setBounds(260, 150, 250, 20);
        add(jLCiudadError);

        jLNumFederador = new JLabel("*Numero Federador:");
        jLNumFederador.setBounds(490, 130, 140, 20);
        add(jLNumFederador);
        jTFNumFederador = new JTextField("");
        jTFNumFederador.setBounds(620, 130, 50, 20);
        add(jTFNumFederador);
        jLNumFederadorError = new JLabel("");
        jLNumFederadorError.setForeground(Color.RED);
        jLNumFederadorError.setBounds(490, 150, 250, 20);
        add(jLNumFederadorError);

        jLSexo = new JLabel("*Sexo:");
        jLSexo.setBounds(730, 130, 40, 20);
        add(jLSexo);
        bGSexo = new ButtonGroup();
        jRBSexoF = new JRadioButton("F");
        bGSexo.add(jRBSexoF);
        jRBSexoF.setBounds(770, 130, 40, 20);
        add(jRBSexoF);
        jRBSexoM = new JRadioButton("M");
        bGSexo.add(jRBSexoM);
        jRBSexoM.setBounds(810, 130, 40, 20);
        add(jRBSexoM);
        jLSexoError = new JLabel("");
        jLSexoError.setForeground(Color.RED);
        jLSexoError.setBounds(730, 150, 250, 20);
        add(jLSexoError);

        jLPassword = new JLabel("*Contraseña:");
        jLPassword.setBounds(30, 180, 80, 20);
        add(jLPassword);
        jTFPassword = new JPasswordField("");
        jTFPassword.setBounds(120, 180, 120, 20);
        add(jTFPassword);
        jLPasswordError = new JLabel("");
        jLPasswordError.setForeground(Color.RED);
        jLPasswordError.setBounds(30, 200, 270, 20);
        add(jLPasswordError);

        jLConfirmPassword = new JLabel("*Confirmar Contraseña:");
        jLConfirmPassword.setBounds(300, 180, 150, 20);
        add(jLConfirmPassword);
        jTFConfirmPassword = new JPasswordField("");
        jTFConfirmPassword.setBounds(450, 180, 120, 20);
        add(jTFConfirmPassword);
        jLConfirmPasswordError = new JLabel("");
        jLConfirmPasswordError.setForeground(Color.RED);
        jLConfirmPasswordError.setBounds(300, 200, 400, 20);
        add(jLConfirmPasswordError);

        jCBTipoComp = new JComboBox();
        jCBTipoComp.addItem("Tirador");
        jCBTipoComp.addItem("Arbitro");
        jCBTipoComp.addItem("Entrenador");
        jCBTipoComp.addItem("Director");
        jCBTipoComp.setBounds(740, 180, 100, 20);
        add(jCBTipoComp);

        jCBTipoArm = new JComboBox();
        jCBTipoArm.addItem("Sable");
        jCBTipoArm.addItem("Espada");
        jCBTipoArm.addItem("Florete");
        jCBTipoArm.setBounds(900, 180, 100, 20);
        add(jCBTipoArm);

        jCheckBCompIndiv = new JCheckBox("Competición Individual");
        jCheckBCompIndiv.setSelected(true);
        jCheckBCompIndiv.setBounds(30, 230, 180, 20);
        add(jCheckBCompIndiv);

        jCheckBCompEquip = new JCheckBox("Competición Equipos");
        jCheckBCompEquip.setBounds(220, 230, 180, 20);
        add(jCheckBCompEquip);

        jLErrorTipoComp = new JLabel("");
        jLErrorTipoComp.setForeground(Color.RED);
        jLErrorTipoComp.setBounds(30, 250, 300, 20);
        add(jLErrorTipoComp);

        jButGuardar = new JButton("Guardar");
        jButGuardar.setBounds(30, 310, 100, 30);
        add(jButGuardar);

        jButSalir = new JButton("Salir");
        jButSalir.setBounds(975, 310, 100, 30);
        add(jButSalir);

        setLayout(null);
        setResizable(false);
        setSize(1120, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        jButGuardar.addActionListener(e -> {
            List<Boolean> listComp = new ArrayList<>();

            comprobarFormato(jTFNombre, jLNombreError, "[A-Za-z]*", 30, "Error tienes que introducir el nombre de forma correcta.", listComp);

            comprobarFormato(jTFApellidos, jLApellidosError, "[A-Za-z]*", 60, "Error tienes que introducir los apellidos de forma correcta.", listComp);

            if (jTFDni.getText().isEmpty()) {
                jLDniError.setText("Error el tienes que introducir el dni con formato correcto.");
                listComp.add(false);
            } else {
                try {
                    if (comprobarDni(jTFDni.getText())) {
                        jLDniError.setText("");
                        listComp.add(true);
                    } else {
                        jLDniError.setText("Error el tienes que introducir el dni con formato correcto.");
                        listComp.add(false);
                    }
                } catch (Exception ex) {
                    jLDniError.setText("Error el tienes que introducir el dni con formato correcto.");
                    listComp.add(false);
                }
            }

            if (jTFTelefono.getText().isEmpty()) {
                jLTelefonoError.setText("Error el telefono es de 9 numeros.");
                listComp.add(false);
            } else {
                if (jTFTelefono.getText().matches("[0-9]*") && jTFTelefono.getText().length() == 9) {
                    jLTelefonoError.setText("");
                    listComp.add(true);
                } else {
                    jLTelefonoError.setText("Error el telefono es de 9 numeros.");
                    listComp.add(false);
                }
            }

            comprobarFormato(jTFCalle, jLCalleError, "[A-Za-z]*", 120, "Error tienes que introducir la calle.", listComp);

            comprobarFormato(jTFPortal, jLPortalError, "[0-9]*", 120, "Error tienes que introducir el portal.", listComp);

            if (jTFCodigoPostal.getText().isEmpty()) {
                jLCodigoPostalError.setText("Error tienes que introducir cod postal.");
                listComp.add(false);
            } else {
                if (jTFCodigoPostal.getText().matches("[0-9]*") && jTFCodigoPostal.getText().length() == 5) {
                    jLCodigoPostalError.setText("");
                    listComp.add(true);
                } else {
                    jLCodigoPostalError.setText("Error tienes que introducir cod postal.");
                    listComp.add(false);
                }
            }

            comprobarFormato(jTFCiudad, jLCiudadError, "[A-Za-z]*", 30, "Error no has introducido una ciudad.", listComp);

            comprobarFormato(jTFNumFederador, jLNumFederadorError, "[0-9]*", 6, "Error tienes que introducir 6 numeros.", listComp);

            if (jRBSexoF.isSelected()) {
                jLSexoError.setText("");
                listComp.add(true);
            } else if (jRBSexoM.isSelected()) {
                jLSexoError.setText("");
                listComp.add(true);
            } else {
                jLSexoError.setText("Error tienes que seleccionar un sexo.");
                listComp.add(false);
            }

            if (jTFPassword.getText().isEmpty()) {
                jLPasswordError.setText("Error tienes que introducir una contraseña.");
                listComp.add(false);
            } else {
                if (jTFPassword.getText().length() <= 10) {
                    jLPasswordError.setText("");
                    listComp.add(true);
                } else {
                    jLPasswordError.setText("Error tienes que introducir una contraseña.");
                    listComp.add(false);
                }
            }

            if (jTFConfirmPassword.getText().equals(jTFPassword.getText())) {
                jLConfirmPasswordError.setText("");
                listComp.add(true);
            } else {
                jLConfirmPasswordError.setText("Error la contraseña a confirmar tiene que ser igual a la contraseña.");
                listComp.add(false);
            }

            if (jCheckBCompIndiv.isSelected()) {
                jLErrorTipoComp.setText("");
                listComp.add(true);
            } else if (jCheckBCompEquip.isSelected()) {
                jLErrorTipoComp.setText("");
                listComp.add(true);
            } else {
                jLErrorTipoComp.setText("Error tienes que elegir un tipo de competición.");
                listComp.add(false);
            }

            boolean correctoFinal = true;
            for (int i = 0; i < listComp.size() && correctoFinal; i++) {
                if (listComp.get(i)) {
                    correctoFinal = true;
                } else{
                    correctoFinal = false;
                }
            }

            if (correctoFinal) {
                guardarInformacion(jTFNombre.getText() + "," + jTFApellidos.getText() + "," + jTFDni.getText() + ","
                        + jTFTelefono.getText() + "," + jTFCalle.getText() + "," + jTFCodigoPostal.getText() + ","
                        + jTFCiudad.getText() + "," + jTFNumFederador.getText() + "," + jRBSexoF.isSelected() + ","
                        + jTFPassword.getText() + "," + jCBTipoComp.getSelectedItem() + "," + jCBTipoArm.getSelectedItem()
                        + "," + jCheckBCompIndiv.isSelected()+ "," + jCheckBCompEquip.isSelected());
                JOptionPane.showMessageDialog(null, "Se ha guardar la información", "Información", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido guardar la información", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        jButSalir.addActionListener(e -> {
            System.exit(0);
        });
    }
    public static void main(String[] args) {
        PrincipalWindowEx05 ventanaPrincipal = new PrincipalWindowEx05();
    }

    private static void comprobarFormato(JTextField jTFComponente, JLabel jLComponenteError, String formato, int numMax, String textoError, List<Boolean> listComp) {
        if (jTFComponente.getText().isEmpty()) {
            jLComponenteError.setText(textoError);
            listComp.add(false);
        } else {
            if (jTFComponente.getText().matches(formato) && jTFComponente.getText().length() <= numMax) {
                jLComponenteError.setText("");
                listComp.add(true);
            } else {
                jLComponenteError.setText(textoError);
                listComp.add(false);
            }
        }
    }

    private static boolean comprobarDni(String dni) throws Exception {
        boolean correcto = false;
        char carac;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = Integer.parseInt(dni.substring(0, dni.length() - 1));

        carac = letras.charAt(num % 23);

        return (carac == dni.charAt(dni.length() - 1));
    }

    private static boolean guardarInformacion(String informacion) {
        try {
            Files.writeString(Path.of("Tema 02/Ejercicio05Formulario/DatosFormulario.csv"), informacion + "\n", StandardOpenOption.APPEND);
        } catch ( IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
