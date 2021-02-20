package com.company;

public class Realtraveller extends Traveller{
    public Realtraveller(){
        super("путешественник");
    }
   public void pull(String what){
        System.out.println(" за собой остальных " + what + "ов. ");
   }
   public void were(Time Enum, String who, String what){
        Enum.getTime();
        System.out.println(who + "и были в " + what + "е, образовавшейся в склоне горы.");
   }
}
