package Primero;
// Fig. 12.2: Suma.java
 // Programa de suma que utiliza a JOptionPane para entrada y salida.
         import javax.swing.JOptionPane;

public class Suma{


    public  static  void  main ( String [] args ) {
        // obtener la entrada del usuario de los diálogos de entrada de JOptionPane
        String  primernumero = JOptionPane . showInputDialog ( "Ingrese el primer entero" );
        String segundonumero = JOptionPane . showInputDialog ( "Ingrese el segundo entero" );

        // convertir las entradas de cadena en valores int para usar en un cálculo
        int numero1 = Integer.parseInt(primernumero);
         int numero2 = Integer.parseInt(segundonumero);

        int  suma = numero1 + numero2 ;

        // mostrar los resultados en un cuadro de diálogo de mensaje JOptionPane

        JOptionPane . showMessageDialog ( null , "La suma es " + suma , "Suma de dos enteros" , JOptionPane . PLAIN_MESSAGE );
    }

} // finaliza la clase Suma