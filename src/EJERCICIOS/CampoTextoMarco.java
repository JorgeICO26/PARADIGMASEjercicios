package EJERCICIOS;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContrasenia;

    public CampoTextoMarco() {
         super("Prueba de JTextField y JPasswordField");
         setLayout(new FlowLayout());

         // construye campo de texto con 10 columnas
         campoTexto1 = new JTextField(10);
         add(campoTexto1); // agrega campoTexto1 a JFrame

         // construye campo de texto con texto predeterminado
         campoTexto2 = new JTextField("Escriba el texto aqui");
         add(campoTexto2); // agrega campoTexto2 a JFrame

         // construye campo de texto con texto predeterminado y 21 columnas
         campoTexto3 = new JTextField("Campo de texto no editable", 21);
         campoTexto3.setEditable(false); // deshabilita la edición
         add(campoTexto3); // agrega campoTexto3 a JFrame

        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia);

        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
}

private class ManejadorCampoTexto implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent evento){
        String cadena = "";

            if(evento.getSource() == campoTexto1)
                cadena = String.format("campoTexto1: %s",
                        evento.getActionCommand());

            else if (evento.getSource() == campoTexto2)
                cadena = String.format("campoTexto2: %s",
                        evento.getActionCommand());

            else if (evento.getSource() == campoTexto3)
                cadena = String.format("campoTexto3: %S",
                        evento.getActionCommand());

            else if (evento.getSource() == campoContrasenia)
                cadena = String.format("campoContrasenia: %s",
                        evento.getActionCommand());

            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}

