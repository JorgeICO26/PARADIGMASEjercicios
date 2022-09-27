package Manejodeerrores;

public class Divición0 {
    public static void main(String[] args) {
        int x=5;
        int y=0;

        try {
            System.out.println(x/y);
        }catch (java.lang.ArithmeticException e){
            System.out.println("no es posible dividir entre 0");
        }

    }
}
/*
teoría
-10 preguntas por medio de form (15 min)
práctico
-ciclos
-if
-casos
-dibujar diagrama UML del código
interfaces
*hacer todos los diagramas del proyecto
 */