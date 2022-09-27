package Manejodeerrores;

public class Principal  {
    public static void main(String[] args) {
        int[] numeros={1,2,3};

        System.out.print("valor ");
        try {
            System.out.println(numeros[3]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("error: "+e.getMessage());
        }
        System.out.println("Final");
    }
}
/*2 tipos de errores:
1.-errores de hardware
2.- excepciones. 2 tipos
2.1.-las que programamos
2.2.-las del archivo. conecta el periférico, error en la salida
*/