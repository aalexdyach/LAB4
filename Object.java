package com.company;

public class Object extends Creature {
    public Object() {
        super("предмет");
    }

    public static class Boot extends Creature {
        public Boot() {
            super(" сапог");
        }

        public void threw(String boot) {
            System.out.print("дорожки космический " + boot);
        }

        public void knew(String what) {
            System.out.println("убедился, что это " + what + " от скафандра. ");
        }
    }
}
