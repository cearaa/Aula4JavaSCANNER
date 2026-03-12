package br.com.fiap;

import java.util.Scanner;

public class Exercício1Scanner {
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
    //Declaração dos objetos na classe float, já que pode dar quebrado.
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Dígite a nota das 4 provas.");
            p1 = scan.nextFloat();
            p2 = scan.nextFloat();
            p3 = scan.nextFloat();
            p4 = scan.nextFloat();
            media = p1 + p2 + p3 + p4 /4;
            System.out.println("Prova 1: " + p1 + "\nProva 2: " + p2 + "\nProva 3: " + p3 + "\nProva 4: " + p4 + "\nMédia: " + media);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
