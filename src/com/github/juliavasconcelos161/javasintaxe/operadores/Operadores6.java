package com.github.juliavasconcelos161.javasintaxe.operadores;

public class Operadores6 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        String nome1 = "Júlia";
        String nome2 = new String("Júlia");
        System.out.println(nome1.equals(nome2));

        if(nome1 == nome2) {
            System.out.println("iguais");
        }

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }
        boolean bool = numero1 == numero2;
        System.out.println("numero1 é igual a numero2?" + bool);

        bool = numero1 != numero2;
        System.out.println("numero1 é diferente a numero2?" + bool);

        bool = numero1 > numero2;
        System.out.println("numero1 é maior que numero2?" + bool);
    }
}
