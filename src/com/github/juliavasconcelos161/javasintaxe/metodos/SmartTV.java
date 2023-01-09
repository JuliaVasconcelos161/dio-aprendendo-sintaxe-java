package com.github.juliavasconcelos161.javasintaxe.metodos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }


}
