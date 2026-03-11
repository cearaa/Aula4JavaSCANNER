package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        int num1, num2, resultado;
        //Declaração de um objeto da classe.
        Scanner scan;

        //Comando para tratamento de erros - Try catch
        try {
        //Instanciação de um objeto.
            scan = new Scanner(System.in);
            System.out.println("Digite dois números inteiros");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            resultado = num1 + num2;
            System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2 + "\nSoma dos valores: " + resultado);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}