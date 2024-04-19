package com.example;

public class Visistatore extends Thread{
    private Giardino g;
    private int matricola;

    public Visistatore(Giardino g, int matricola) {
        this.g = g;
        this.matricola = matricola;
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
