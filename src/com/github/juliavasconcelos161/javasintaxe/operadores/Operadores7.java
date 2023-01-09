package com.github.juliavasconcelos161.javasintaxe.operadores;

public class Operadores7 {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)) {
            System.out.println("as duas são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira");
        }
    }
}
