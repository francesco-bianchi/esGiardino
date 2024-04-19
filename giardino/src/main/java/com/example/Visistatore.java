package com.example;

public class Visistatore extends Thread{
    private Giardino g;

    public Visistatore(String nome, Giardino g) {
        super(nome);
        this.g = g;
    }

    public void run(){
        try {
            char ingresso= g.entra();
            if(ingresso == 'a')
                Thread.sleep(3000);
            else if(ingresso == 'b')
                Thread.sleep(5000);
            g.esci(ingresso);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
