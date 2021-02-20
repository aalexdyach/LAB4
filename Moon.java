package com.company;

public class Moon extends Creature{
    public Moon(){
        super("Луну");
    }
    private String name = "Луну ";
    public void understand(Pronouns Enum, String who, String understand, String who1){
        System.out.print("Увидев");
        Enum.getNoun();
        System.out.println("головоломные прыжки, " + who + understand + ", что совершил ошибку, взяв на " + name + who1);

    }
    String give(String who){
        return who + " отдал ему приказ";
    }
    public void come(String who, Place Enum){
        System.out.print(give(". Он") + " вернуться");
        Enum.getPlace();
        System.out.print(", но " + who);

    }
    public static class Cave extends Creature{
        public Cave(){
            super("пещер");
        }
        public void run(String where, Place Enum){
            System.out.print("когда бежал из " + where + "ы");
            Enum.getPlace();
            System.out.println(".");
        }
    }
    private class Lowering{
        private String name = " спуск";
        public void does(){
            System.out.println(name + ".");
        }
    }
    public void doess(){
        Lowering lowering = new Lowering();
        lowering.does();
    }

}
