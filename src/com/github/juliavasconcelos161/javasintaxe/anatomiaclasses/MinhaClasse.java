package com.github.juliavasconcelos161.javasintaxe.anatomiaclasses;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem-vindos");
        //Classe deve possuir mesmo nome do arquivo
        //variável = camelCase;
        //método = camelCase;
        //constantes = UpperCase, separadas por underline;

        String meuNome = "Júlia";
        int anoFabricacao = 2022;
        boolean verdade = true;
        anoFabricacao = 2023;

        String primeiroNome = "Júlia";
        String sobrenome = "Vasconcelos";
        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String sobrenome) {
        return primeiroNome.concat(" ").concat(sobrenome);
    }

}
