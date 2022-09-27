package Figuras;

public class Triangulo extends  Figura{
    private double lado3;
    private double altura;
    private double area;
    private double lado1;
    private double lado2;
    private double perimetro;

    public Triangulo(double lado3, double lado2, double lado1){
        this.lado3 = lado3;
        this.lado2 = lado2;
        this.lado1 = lado1;
    }

    @Override
    public double calcularArea() {
        double s=(lado1+lado2+lado3)/2;
        area=Math.sqrt((s*(s-lado1)*(s-lado2)*(s-lado3)));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro= lado1+lado2+lado3;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", area=" + calcularArea() +
                "perimetro=" + calcularPerimetro()+
                '}';
    }
}
//completar el método calcularPerimetro TAREAAAAAA
//del triángulo
//del cuadrado