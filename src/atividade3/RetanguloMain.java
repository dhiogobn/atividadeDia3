package atividade3;

import javax.swing.*;

public class RetanguloMain {
    public static void main(String[] args) {

        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado 1"));
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado 2"));
        Retangulo r1 = new Retangulo(lado1, lado2);

        JOptionPane.showMessageDialog(null, "Calculo da área deu: "+r1.calcularArea());
        JOptionPane.showMessageDialog(null, "Calculo do perímetro deu: "+r1.calcularPerimetro());
    }
}
