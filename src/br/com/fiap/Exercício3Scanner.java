package br.com.fiap;

import java.util.Scanner;

public class Exercício3Scanner {
    public static void main(String[] args) {
        double raio, area;
        //Ou final double: 3,14,15...
        Scanner scan;
        
        try {
            scan = new Scanner(System.in);
            System.out.println("Digíte o valor do raio");
            raio = scan.nextDouble();
            area = Math.PI * raio * raio;
            System.out.println("Valor do raio: " + raio + "\nResultado, valor de Área: " + area);
        } catch (Exception e) {
            System.out.println("Número invalido");
        }
    }
}
