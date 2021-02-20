package com.company;

public class Klepka extends Creature implements ToFlow{
    public Klepka(){
        super("Клепка");
    }
    public void slip(String who, Place Enum){
        System.out.print(" как шедший");
        Enum.getPlace();
        System.out.print(who + " поскользнулся на ");
    }
    @Override
    public void fall(Place Enum, Place Enum2){
        System.out.println("упав на спину, покатился");
        Enum.getPlace();
    }
    public void allow(String what, String who){
        System.out.print("Подтащив к себе на " + what + "е " + who + ", ");
    }
    private String order = "приказ";
    public void notice(Pronouns Enum){
        Enum.getNoun();
        System.out.println(order + " и продолжал кувыркаться.");
    }
    public void snatch(Place Enum, String who, String who1, String what){
        Enum.getPlace();
        System.out.print(who + " выхватил у " + who1 + what);
    }
}
