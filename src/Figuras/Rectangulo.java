package Figuras;
public class Rectangulo {
    private double area;
    private double lado1;
    private double lado2;
    private double perimetro;

    public Rectangulo(  double lado1, double lado2){

        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public double calcularArea() {
        area=lado1*lado2;
        return area;
    }


    public double calcularPerimetro() {
        perimetro= lado1+lado1+lado2+lado2;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "area=" + calcularArea() +
                " lado1=" + lado1+
                "lado2=" + lado2+

                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
//completar el método calcularPerimetro TAREAAAAAA
//del triángulo
//del cuadrado


