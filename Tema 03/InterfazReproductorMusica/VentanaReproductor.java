import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class VentanaReproductor extends JFrame {
    private JButton onOff;
    private JButton play;
    private JButton record;
    private JButton pistaAnterior;
    private JButton pause;
    private JButton pistaPosterior;
    private JButton rebobinarAtras;
    private JButton stop;
    private JButton rebobinarAdelante;
    private JPanel panelBotones;

    public VentanaReproductor() {
     super("Reproductor");
     setBackground(new Color(237, 237, 237));
     panelBotones = new JPanel();
     add(panelBotones);

     panelBotones.setLayout(new GridLayout(3, 3));
     panelBotones.setBackground(new Color(237, 237, 237));

     onOff = new JButton();
     onOff.setBorder(new EmptyBorder(1, 1, 1, 1));
     onOff.setBackground(new Color(237, 237, 237));
     ImageIcon iconOn = new ImageIcon("Tema 03/InterfazReproductorMusica/onOff.jpg");
     onOff.setIcon(iconOn);
     panelBotones.add(onOff);
     play = new JButton();
     play.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconPlay = new ImageIcon("Tema 03/InterfazReproductorMusica/play.jpg");
     play.setIcon(iconPlay);
     play.setBackground(new Color(237, 237, 237));
     panelBotones.add(play);
     record = new JButton();
     record.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconRecord = new ImageIcon("Tema 03/InterfazReproductorMusica/record.jpg");
     record.setIcon(iconRecord);
     record.setBackground(new Color(237, 237, 237));
     panelBotones.add(record);
     pistaAnterior = new JButton();
     pistaAnterior.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconPistAnt = new ImageIcon("Tema 03/InterfazReproductorMusica/pistaAnterior.jpg");
     pistaAnterior.setIcon(iconPistAnt);
     pistaAnterior.setBackground(new Color(237, 237, 237));
     panelBotones.add(pistaAnterior);
     pause = new JButton();
     pause.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconPause = new ImageIcon("Tema 03/InterfazReproductorMusica/pause.jpg");
     pause.setIcon(iconPause);
     pause.setBackground(new Color(237, 237, 237));
     panelBotones.add(pause);
     pistaPosterior = new JButton();
     pistaPosterior.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconPistPost = new ImageIcon("Tema 03/InterfazReproductorMusica/pistaPosterior.jpg");
     pistaPosterior.setIcon(iconPistPost);
     pistaPosterior.setBackground(new Color(237, 237, 237));
     panelBotones.add(pistaPosterior);
     rebobinarAtras = new JButton();
     rebobinarAtras.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconRebAtras = new ImageIcon("Tema 03/InterfazReproductorMusica/rebobinarAtras.jpg");
     rebobinarAtras.setIcon(iconRebAtras);
     rebobinarAtras.setBackground(new Color(237, 237, 237));
     panelBotones.add(rebobinarAtras);
     stop = new JButton("STOP");
     stop.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconStop = new ImageIcon("Tema 03/InterfazReproductorMusica/stopOriginal.jpg");
     stop.setIcon(iconStop);
     stop.setBackground(new Color(237, 237, 237));
     panelBotones.add(stop);
     rebobinarAdelante = new JButton("REBOBINAR ADELANTE");
     rebobinarAdelante.setBorder(new EmptyBorder(1, 1, 1, 1));
     ImageIcon iconRebAdel = new ImageIcon("Tema 03/InterfazReproductorMusica/rebobinarAnterior.jpg");
     rebobinarAdelante.setIcon(iconRebAdel);
     rebobinarAdelante.setBackground(new Color(237, 237, 237));
     panelBotones.add(rebobinarAdelante);

     setLocationRelativeTo(null);
     setSize(700, 600);
     setResizable(false);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setVisible(true);
    }

    public static void main(String[] args) {
        VentanaReproductor ventana = new VentanaReproductor();
    }
}
