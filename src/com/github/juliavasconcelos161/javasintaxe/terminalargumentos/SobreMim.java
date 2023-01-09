package com.github.juliavasconcelos161.javasintaxe.terminalargumentos;

import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        //Imprimindo dados
        System.out.println("Olá, meu nome é " + nome);
        System.out.println("Meu sobrenome é " + sobrenome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Minha altura é " + altura);

    }
}
