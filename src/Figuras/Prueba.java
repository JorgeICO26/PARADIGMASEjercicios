package Figuras;

public class Prueba {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2,3,4);
        System.out.printf(t1.toString());
        Cuadrado c1= new Cuadrado(9);
        System.out.println(c1.toString());
        Rectangulo r1= new Rectangulo(2,3);
        System.out.println(r1.toString());
    }
}
