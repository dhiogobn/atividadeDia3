package atividade4;

public class Circulo {
    private double raio;
    private double area;
    private double perimetro;

    public Circulo() {

    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void calcularArea() {
        this.area = this.raio*this.raio*3.14;
    }

    public void calcularPerimetro() {
       this.perimetro = 2* 3.14 * this.raio;
    }

}
