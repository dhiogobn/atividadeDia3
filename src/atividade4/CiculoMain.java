package atividade4;

import javax.swing.*;

public class CiculoMain {
    public static void main(String[] args) {
        float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio: "));
        Circulo circulo = new Circulo(raio);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        JOptionPane.showMessageDialog(null, "Área do circulo: \n"+circulo.getArea());
        JOptionPane.showMessageDialog(null, "Área do perímetro: \n"+circulo.getPerimetro());
    }
}
