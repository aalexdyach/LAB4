package com.company;

public class Ice extends Creature{
    public Ice(){
        super("лед");
    }
    public void go(String what){
        System.out.print(" переходя через " + what);
    }
    public void make(Time Enum){
        System.out.println("ники.");
    }
    public void ice(){
        System.out.print("льду и, ");
    }
}
