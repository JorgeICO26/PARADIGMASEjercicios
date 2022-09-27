package Figuras;

public class Cuadrado extends Figura {

    private double area;
    private double lado1;
    private double perimetro;

    public Cuadrado(  double lado1){


        this.lado1 = lado1;
    }

    @Override
    public double calcularArea() {
        area=lado1*lado1;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro= lado1+lado1+lado1+lado1;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "area=" + calcularArea() +
                ", lado1=" + lado1 +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
//completar el método calcularPerimetro TAREAAAAAA
//del triángulo
//del cuadrado

