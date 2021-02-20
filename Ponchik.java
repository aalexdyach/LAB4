package com.company;

public class Ponchik extends Creature{
    public Ponchik(){
        super("Пончик");
    }
    public void threw(String who){
        System.out.print(", который " + who + " сбросил с ноги, ");
    }
}
