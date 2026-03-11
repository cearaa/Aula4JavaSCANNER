package br.com.fiap;

import java.util.Scanner;

public class Exercício2Scanner {
    public static void main(String[] args) {
        int AnoAtual, AnoNasc, idade;
        //Declaração do objeto
        Scanner scan;
        try {
        scan = new Scanner(System.in);
            System.out.println("Digíte o ano atual");
            System.out.println("Digíte o seu ano de Nascimento");
            AnoAtual = scan.nextInt();
            AnoNasc = scan.nextInt();
            idade = AnoAtual - AnoNasc;
            System.out.println("Ano atual: " + AnoAtual + "\nDigite o seu ano de Nascimento: " + AnoNasc + "\nSua Idade atual: " + idade);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
            throw new RuntimeException(e);
        }
    }
}
