package com.company;

public class Alpenstok extends Creature {
    public Alpenstok() {
        super("альпеншток");
    }

    public void stress(String what, String what2) {
        System.out.print(" стальными остриями " + what + "ов в " + what2);
    }

    public void fasten(String what) {
        class Ostrye extends Creature{
            public Ostrye(){
                super("острие ");
            }
        }
        Ostrye ostrye = new Ostrye();
        System.out.println(" и нацепил его на " + ostrye.getName() + what + "a. ");
    }
}
