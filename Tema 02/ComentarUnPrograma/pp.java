import javax.swing.*;
import java.awt.*;

/**
 * Clase llamada 'pp' que extiende de JFrame que viene del paquete Swing.
 */
public class pp extends JFrame {
    /**
     * Constructor de la clase 'pp'.
     */
    public pp () {
        //El super representa el constructor de la clase JFrame, se le introduce el nombre de la ventana.
        super("Mi primera ventana");
        //Con setSize() se le introduce las dimensiones de la ventana donde el primer valor que es el width que es
        //la anchura que en este caso es 300 y el segundo numoro que es el height es la altura de 300.
        setSize(300,300);
        //setBackground() es para definir el fondo de la ventana en este caso se le intruce un objeto color representado
        //en RGB.
        setBackground(new Color(0, 64, 128));
        //Con setSize() se le introduce las dimensiones de la ventana donde el primer valor que es el width que es
        //la anchura de 600 y el segundo numoro que es el height es la altura de 600.
        setSize(600, 600);
        //Declaración de una variable de tipo JButton llamada buton la cual se instancia creando un objeto JButton que
        //se le pasa como parametro el texto del boton.
        JButton button = new JButton("Pulsa aquí");
        //Ahora con el setFont() cambia la fuente del texto del boton con un objeto de tipo Font donde cambia el tipo
        //de fuente, el estilo de la fuente y el tamaño del texto.
        button.setFont(new Font("Arial", Font.PLAIN, 11));
        //Representa los limites de anchura y altura para cada lado del boton.
        button.setBounds(20, 30, 30, 30);
        //El boton tendra el texto de color azul.
        button.setForeground(Color.BLUE);
        //El fondo del boton sera de color blanco.
        button.setBackground(Color.white);
        //Al poner el cursos del raton encima del boton saldra este mensaje.
        button.setToolTipText("Esto es una prueba");
        //En este case se añade el boton a la ventana en la posicion de arriba del todo anclado.
        getContentPane().add(button, BorderLayout.NORTH);

        //Declaración de una variable de tipo JTextField donde se le instancia sin ningun texto.
        JTextField textField1 = new JTextField();
        //Se le aplica al cuadro de texto los limites de archura, altura en cada lado.
        textField1.setBounds(90, 60, 100, 30);
        //Se el texto del cuadro de texto sera posicionado horizontalmente a la derecha.
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        //Se le introduce el siguiente texto al cuadro de texto.
        textField1.setText("Y aún otra prueba");
        //Le pone el fondo del cuadro de texto el color rosa.
        textField1.setBackground(Color.pink);
        //Añade dicho componente a la ventana.
        add(textField1);

        //Cuando la ventana se cierre el programa terminara y se cerrara.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //La ventana se vuelve visible.
        setVisible(true);
    }

    /**
     * Clase principal.
     * @param args
     */
    public static void main(String[] args) {
        //Declaracion de una variable de tipo pp y su instanciación.
        pp i= new pp();

        //Declaracion una variable de tipo ToolKit donde dicha variable recibe el kit por defecto de dicha clase.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //Se declara otra variable de tipo Dimension donde recibe de la variable anterior las dimensiones de la
        //pantalla.
        Dimension screenSize = toolkit.getScreenSize();
        //Se introduce el siguiente texto con la altura y anchura de dicha pantalla en una variable de tipo String.
        String resolucion = "La resolución de la pantalla es de " +
                (int)screenSize.getWidth() + " x " +
                (int)screenSize.getHeight();

        //Representa una ventana informativa donde se mortrara el mensaje de la resolucion de la pantalla y tiene como
        //icono el de informacion.
        JOptionPane.showMessageDialog(null, resolucion,
                "Resolución de la pantalla",
                JOptionPane.INFORMATION_MESSAGE);
    }
}