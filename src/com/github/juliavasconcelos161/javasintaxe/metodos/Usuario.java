package com.github.juliavasconcelos161.javasintaxe.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Tv Volume: " + smartTV.volume);

        System.out.println("Tv Ligada: " + smartTV.ligada);
        System.out.println("Tv Canal: " + smartTV.canal);
        smartTV.mudarCanal(10);
        System.out.println("Tv Canal: " + smartTV.canal);
        System.out.println("Tv Volume: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status: TV Ligada: " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status: TV Ligada: " + smartTV.ligada);
    }
}
