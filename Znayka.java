package com.company;

public class Znayka extends Creature {
    public Znayka(){
        super("Знайка");
    }


    public void order(String who, String who2, String Case, Place Enum){
        if(Case == "велел")
            System.out.print(who + " велел " + who2);
        else if(Case == " распорядился"){
            System.out.print(who + Case + ", чтоб его привязали");
            Enum.getPlace();
        }
    }
    public void climb(String who, Place Enum2){
        System.out.print(who + "х и не разрешали вылезать");
        Enum2.getPlace();
        System.out.println();
    }
    public void see(Time Enum, Time Enum1, String who, Place Enum2){
        Enum.getTime();
        Enum1.getTime();
        System.out.print(who + " увидел");
        Enum2.getPlace();
    }
    public void understand(String who, Time Enum, String what, Time Enum1){
        System.out.print(who + " даже");
        Enum.getTime();
        System.out.print("понял, что это за " + what + ", но ");
        Enum1.getTime();
    }

    public void scary(String who){
        System.out.print(who + " побоялся продолжать");
    }
}
