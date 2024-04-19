package com.example;

public class Main {
    public static void main(String[] args) {
        Giardino g1 = new Giardino();
        Visistatore[] vis = new Visistatore[50];

        for(int i=0; i<vis.length;i++){
            vis[i] = new Visistatore("visitatore" + i, g1);
        }

        for(int i=0; i<vis.length;i++){
            vis[i].start();
        }

    }
}