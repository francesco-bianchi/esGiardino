package com.example;

public class Giardino {
    private int ingressoA=5;
    private int ingressoB=10;
    char ingresso;

    public synchronized char entra(){
        String name = Thread.currentThread().getName();
        try {
            while(ingressoA==0 && ingressoB==0){
                //System.out.println("Giardino pieno");
                wait();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(ingressoA!=0){
            ingressoA--;
            ingresso = 'a';
            System.out.println(name + " entra nell'ingresso: " + ingresso);
        }
        else if(ingressoB!=0){
            ingressoB--;
            ingresso = 'b';
            System.out.println(name + " entra nell'ingresso: " + ingresso);
        }
        return ingresso;
    }

    public synchronized void esci(char ingresso){
        String name = Thread.currentThread().getName();
        if(ingresso == 'a'){
            ingressoA++;
            System.out.println(name + " esce da: " + ingresso);
        }
        else{
            ingressoB++;
            System.out.println(name + " esce da: " + ingresso);
        }
        notifyAll();
    }
    

}
