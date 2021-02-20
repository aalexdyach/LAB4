package com.company;

public class Tunnel extends Creature{
    public Tunnel(){
        super("тоннел");
    }
    public void come(Time Enum, String where){
        System.out.print("и ");
        Enum.getTime();
        System.out.println("очутились в " + where + "е с ледяным дном. ");
    }
    public void notice(String what, Place Enum){
        System.out.print("Заметив, что ледяное дно " + what + "я шло");
        Enum.getPlace();
    }
    public void become(Time Enum, String what){
        Enum.getTime();
        System.out.print("наклон " + what + "я сделался таким крутым, что ");
    }
    public void stand(Pronouns Enum, String what){
        class Step extends Creature{
            public Step(){
                super("ступенька");
            }
            String slip(String what){
                return what + " не выcкользнула из рук.";
            }
        }
        Step step = new Step();
        System.out.print("ледяных " + step.getName() + "х и");
        Enum.getNoun();
        System.out.println("отпускали " + what + "у, следя, чтобы " + step.slip("она"));
    }
}
