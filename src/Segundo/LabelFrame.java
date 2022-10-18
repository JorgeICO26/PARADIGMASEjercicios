package Segundo;
// Fig. 12.6: LabelFrame.java
 // Componentes Jlabel con texto e iconos.
         import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
  import javax.swing.JFrame; // proporciona las características básicas de una ventana

         import javax.swing.JLabel; // muestra texto e imágenes
  import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
 import javax.swing.Icon; // interfaz utilizada para manipular imágenes
  import javax.swing.ImageIcon; // carga las imágenes
public class LabelFrame  extends JFrame{
    private JLabel label1; // JLabel with text only
    private JLabel label2; // JLabel built with text and an icon
    private JLabel label3; // JLabel with additional text and icon

    //LabelFrame constructor adds JLabel objects to JFrame
    public LabelFrame() {
        super("JLabel test");
        setLayout(new FlowLayout()); // set the frame schema

        // JLabel constructor with a String argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1); // add label1 to JFrame

        // JLabel constructor with string, Icon, and alignment arguments
        Icon insect = new ImageIcon(getClass().getResource("insecto.jpg"));
        label2 = new JLabel("Label with text and icon", insect, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); // add label2 to JFrame

        label3 = new JLabel(); // JLabel constructor with no arguments
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(insect); // add icon to JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3); // add label3 to JFrame
    }
}// end LabelFrame class

