package oop.game;

import oop.characters.Rollable;

public class DiceRoll implements Rollable {
    public static void customDi() {
        int min = 1;
        int range = 20;
        int rand = (int) (Math.random() * range) + min;
        System.out.printf("Rolled a %d%n", rand);
    }

    @Override
    public int attackRoll() {
        int min = 1;
        int range = 20;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }

    @Override
    public int defenseRoll() {
        int min = 1;
        int range = 20;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }
}
