package br.com.fiap;

import javax.swing.*;

public class Exercício2JOption {
    public static void main(String[] args) {
        int AnoAtual, AnoNascimento, idade;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Qual o ano atual?");
            AnoAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Quando você nasceu?");
            AnoNascimento = Integer.parseInt(auxiliar);
            idade = AnoAtual - AnoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
