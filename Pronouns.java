package com.company;

public enum Pronouns {
    THESE(" эти "),
    THIS(" этот "),
    ONLY(" только "),
    GRADUALL(" постепенно "),
    HIS("О своих "),
    ;
    private final String Enum;
    Pronouns(String Enum){
        this.Enum = Enum;
    }
    public void getNoun(){
        System.out.print(Enum);
    }
}
