package atividade3;

public class Retangulo {
    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    public Retangulo() {

    }
    public Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public double calcularArea() {
        this.area = this.lado1 * this.lado2;
        return this.area;
    }

    public double calcularPerimetro() {
        this.perimetro =  2*this.lado1 + 2*this.lado2;
        return this.perimetro;
    }
}
