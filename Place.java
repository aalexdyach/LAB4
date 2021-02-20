package com.company;

public enum Place {
    FURTHER(" дальше "),
    UNDER(" под уклон, "),
    INFRONT(" впереди "),
    DOWN("вниз. "),
    BEHIND(" позади "),
    HERE("Тут "),
    NONE(" "),
    ABOVE(" вверху "),
    IN(" в ракету"),
    ASIDE(" в стороне от "),
    TO(" к себе "),
    WAY(" в путь "),
    BELTS(" к поясам ");
    private final String place;
    Place(String place){
        this.place = place;
    }
    public void getPlace(){
        System.out.print(place);
    }
}
