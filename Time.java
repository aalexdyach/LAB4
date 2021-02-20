package com.company;

public enum Time {
    SOON("скоро "),
    INTIME(" вовремя"),
    IMMEDIATELY(" тотчас "),
    JUST("Как раз "),
    ATONCE(" не сразу "),
    SOOON("Вскоре "),
    LONG(" долго "),
    ATLAST("Наконец "),
    IN(" через несколько минут "),
    ATTIME("в это время "),
    NONE("");
    private final String time;

    Time(String time) {
        this.time = time;
    }

    public void getTime() {
        System.out.print(time);
    }
}
