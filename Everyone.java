package com.company;

public class Everyone extends Creature{
    public Everyone(){
        super("Все");
    }
    public void move(String who, Place Enum){
        System.out.print(who + " двинулись");
        Enum.getPlace();
    }
    public void stress(String who){
        System.out.print(who + " принялись упираться");
    }
}
