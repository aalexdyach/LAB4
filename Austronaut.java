package com.company;

public class Austronaut {
    private String name = "космонавты";

//    public Austronaut() {
//        this.name = name;
//    }

    public String getName(){
        return name;
    }

    public void stand(){
        System.out.print("Остальные " + getName() + " стояли на ");
    }
}



