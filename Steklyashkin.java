package com.company;

public class Steklyashkin extends Creature{
    public Steklyashkin(){
        super("Стекляшкин");
    }
    public void order(String who, Place Enum){
        System.out.print(who + "а и велел ему осторожно спускаться ");
        Enum.getPlace();
        System.out.println("");
    }
    public void tell(Pronouns Enum, Place Enum1){
        Enum.getNoun();
        System.out.print("впечатлениях " + getName() + " сообщал оставшимся");
        Enum1.getPlace();
        System.out.println("по радиотелефону.");
    }
    public void live(Time Enum, Time Enum1, Time Enum2, String str) throws VoiceException{
        class He extends Creature{
            public He(){
                super("Он");
            }
        }
        He he = new He();
        System.out.print(he.getName());
        Enum.getTime();
        System.out.println("не подавал признаков жизни.");
        Enum1.getTime();
        System.out.print("закричал:" + he.getName() + " замолчал, но");
        Enum2.getTime();
        if(str == "послышался"){
            System.out.print(str + " его голос:");
        }
        else {
            throw new VoiceException("не послышался его голос");
        }
    }
}
