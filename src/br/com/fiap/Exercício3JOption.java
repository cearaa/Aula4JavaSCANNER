package br.com.fiap;

import javax.swing.*;

public class Exercício3JOption {
    public static void main(String[] args) {
        double raio, area;
        String auxiliar;
        try {
        auxiliar = JOptionPane.showInputDialog("Qual a área que você deseja usar?");
        raio = Double.parseDouble(auxiliar);
        area = Math.PI * raio * raio;
        JOptionPane.showMessageDialog(null, "O valor da área é: " + area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
            throw new RuntimeException(e);
        }
    }
}
